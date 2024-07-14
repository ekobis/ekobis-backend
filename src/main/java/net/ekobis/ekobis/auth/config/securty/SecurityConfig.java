package net.ekobis.ekobis.auth.config.securty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       return http
                .csrf(AbstractHttpConfigurer::disable)
               .authorizeHttpRequests(auth -> auth
                       .anyRequest().permitAll()
               )
               .formLogin(Customizer.withDefaults())
               .httpBasic(Customizer.withDefaults())
               .build();
    }

}