package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/home").permitAll()
			.antMatchers("/resources/**").permitAll()
			.antMatchers("/account/register").permitAll()
			.antMatchers("/account/login").permitAll()
			.antMatchers("/**").authenticated()
			.and().formLogin()
			.and().logout()
			.and().csrf().disable();
		
//		http.formLogin().loginPage("/account/login").defaultSuccessUrl("/home").usernameParameter("").passwordParameter("");
		http.logout().logoutUrl("/logout").logoutSuccessUrl("/home").invalidateHttpSession(true).deleteCookies("JSESSIONID");
	}
	
	@Autowired
	@Qualifier("dataSource")
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		 auth.inMemoryAuthentication()	
		 .withUser("iamuserone").password("{noop}9922").roles("MEMBER") .and()
		 .withUser("iamadminone").password("{noop}9922").roles("ADMIN");
		 
//		 auth.jdbcAuthentication()
//			.dataSource(dataSource)
//			.usersByUsernameQuery("SELECT user_name, passwd, enabled FROM tbl_users WHERE user_name = ?")
//			.authoritiesByUsernameQuery("SELECT user_name, role_name FROM tbl_users_roles WHERE user_name = ?")
//			.passwordEncoder(passwordEncoder());
		 
	}
	
	
		
		

}


