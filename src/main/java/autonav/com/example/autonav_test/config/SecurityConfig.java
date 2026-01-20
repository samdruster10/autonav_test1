package autonav.com.example.autonav_test.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/login", "/api/vehicles/**").permitAll()
                .anyRequest().permitAll()
            .and()
            .csrf().disable()
            .formLogin().disable()
            .httpBasic().disable();
    }
}
