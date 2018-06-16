/**
 * 
 */
package com.empcab.dto.security;

/**
 * @author Madhu.R
 *
 */
/**@Component
public class JWTAuthenticationFilter extends GenericFilterBean {

	@Autowired
	AuthTokenUtil authTokenUtil;

	static final String TOKEN_PREFIX = "Bearer";

	static final String HEADER_STRING = "Authorization";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		UsernamePasswordAuthenticationToken authentication = getAuthentication((HttpServletRequest) request);

		SecurityContextHolder.getContext().setAuthentication(authentication);
		filterChain.doFilter(request, response);
	}

	UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
		String token = request.getHeader(HEADER_STRING);
		if (StringUtils.isNotBlank(token)) {

			// String user =
			// Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token.replace(TOKEN_PREFIX,
			// ""))
			// .getBody().getSubject();

			UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(token, null,
					emptyList());
			authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails((HttpServletRequest) request));
			return authentication;

		}
		return null;
	}
}

**/
