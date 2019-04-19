package in.arya.auth.resource.server.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.bind.annotation.RestController;

@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/oauth/token", "/oauth/authorize**", "/publica").permitAll();
		http.requestMatchers().antMatchers("/privada").and().authorizeRequests().antMatchers("/privada")
				.access("hasRole('USER')").and().requestMatchers().antMatchers("/admin").and().authorizeRequests()
				.antMatchers("/admin").access("hasRole('ADMIN')");
	}
}
