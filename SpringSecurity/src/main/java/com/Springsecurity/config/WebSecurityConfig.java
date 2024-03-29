package com.Springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.Springsecurity.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired
//	private UserDetailsService userDetailsService;
	

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
                auth
                    .userDetailsService(userDetailsService)
                    .passwordEncoder(passwordEncoder());
    }

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(authenticationProvider());
//	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/","/register").permitAll()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("ADMIN","USER")
		
		.and().formLogin();
	}
	
	 @Override
	    public void configure(WebSecurity web) throws Exception {
	        web
	                .ignoring()
	                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
	    }
	
	
	

}
