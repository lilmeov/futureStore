package com.attractor.futureStore.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    private final DataSource dataSource;

    String fetchUserQuery = "select username, password, enabled from users where username= ?";
    String fetchRoleQuery = "select username, role from users where username= ?";

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(fetchUserQuery)
                .authoritiesByUsernameQuery(fetchRoleQuery)
                .passwordEncoder(bCryptPasswordEncoder);
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
//                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/Cart/saveProdAndUser").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/register").permitAll();
    }
}
