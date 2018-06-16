package com.empcab.dto.security;

/**@Component
public class TokenAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.getOutputStream().println(
				"{ \"code\": \"401\", \"message\": \"Unauthorized: Authentication token was either missing or invalid."
						+ "\" }");
	}
}
**/