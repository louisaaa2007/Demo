package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.AuthorizationFilter;


public class SecurityConfig  {
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			
	    }
	 
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			return http
					.csrf(csrf->csrf.disable())
		            .authorizeHttpRequests((authz) -> authz
		            		.requestMatchers("/user/testUnblock").permitAll()
		            		.requestMatchers("/user/create").permitAll()
		                    .requestMatchers("/user/testBlock").authenticated()
		                    
		                )
		            .httpBasic(Customizer.withDefaults())
					.build();
					
	    }
	 
}
