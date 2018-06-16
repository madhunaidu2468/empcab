package com.empcab.dto.security;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.empcab.util.CommonUtils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class AuthTokenUtil {

	@Value("${auth.token.key}")
	private String secretKey;

	@Value("${auth.token.expiration}")
	private int expiration;

	static final String TOKEN_PREFIX = "Bearer";

	static final String HEADER_STRING = "Authorization";

	private static final String CLAIM_KEY_USERID = "user";

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthTokenUtil.class);

	// for web admin and installer
	public String generateToken(String userId) {
		return Jwts.builder().setSubject(userId).setExpiration(new Date(System.currentTimeMillis() + expiration))
				.signWith(SignatureAlgorithm.HS256, secretKey).compact();		
	}

	public String getUserIdFromToken(String token) {
		final Claims claims = getClaimsFromToken(token);
		if (claims == null) {
			return null;
		}
		return (String) claims.get(CLAIM_KEY_USERID);
	}

	private  Claims getClaimsFromToken(String token) {
		Claims claims;
		try {
			claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
		} catch (Exception e) {
			LOGGER.error("getClaimsFromToken: exception ", e);
			claims = null;
		}
		return claims;
	}

	public  Date getExpirationDateFromToken(String token) {
		final Claims claims = getClaimsFromToken(token);
		if (claims == null) {
			return null;
		}
		return claims.getExpiration();
	}

	public Date generateExpirationDate() {
		Instant instant = CommonUtils.getCurrentTime().toInstant(ZoneOffset.UTC).plus(30, ChronoUnit.MINUTES);
		return Date.from(instant);
	}

	public  Boolean isTokenExpired(String token) {
		final Date expirationTemp = getExpirationDateFromToken(token);
		return expirationTemp.before(new Date());
	}

}
