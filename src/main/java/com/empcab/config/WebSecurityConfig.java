/**
 * 
 */
package com.empcab.config;

/**
 * @author Madhu.R
 *
 */
/**
 * @Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

	 @Override
	  protected void configure(HttpSecurity http) throws Exception {
	    http.csrf().disable().authorizeRequests()
	        .antMatchers("/").permitAll()
	        .anyRequest().permitAll();
	  }
	 
}
**/
