/**
 * 
 */
package com.empcab.dto.security;

/**
 * @author Madhu.R
 *
 */

/**
@Component
public class TokenAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	UserDao userDao;

	@Autowired
	AuthTokenUtil authTokenUtil;

	private static final Logger LOGGER = Logger.getLogger(TokenAuthenticationProvider.class);

	private static final String NOACCESSLABEL = "No access to user";

	@Override
	public Authentication authenticate(Authentication authentication) {
		try {
			String authToken = authentication.getPrincipal().toString();

			return validateWebUser(authToken);

		} catch (ApplicationException e) {
			LOGGER.error("authenticate: OperationalException ", e);
			throw new BadCredentialsException(NOACCESSLABEL);
		} catch (Exception e) {
			LOGGER.error("authenticate: Exception ", e);
			throw new BadCredentialsException(NOACCESSLABEL);
		}
	}

	private UsernamePasswordAuthenticationToken validateWebUser(String authToken) throws ApplicationException {
		final String userId = authTokenUtil.getUserIdFromToken(authToken);

		if (userId == null) {
			throw new BadCredentialsException(NOACCESSLABEL);
		}

		UserToken userToken = userDao.getUserToken(Integer.parseInt(userId), authToken);
		if (userToken == null) {
			throw new BadCredentialsException(NOACCESSLABEL);
		}
		LOGGER.info("setting security context authenticated web user " + userId);
		return new UsernamePasswordAuthenticationToken(userToken.getUserId(), null);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
**/
