package com.HellPassHospital.Hospital.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

//RELEER LO QUE DIJO CHATGPT
/*
*
*
* */
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // 🔹 Deshabilita CSRF y frameOptions para permitir que funcione H2
                .csrf(csrf -> csrf.disable())
                .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()))
                .authorizeHttpRequests(auth->auth. //
                        requestMatchers("/**").permitAll())
                /*
                * el authorizedhttprequests....permiteAll() es un metodo donde
                * defino que todas las requests son publicas, basicamente
                * tengo spring security al reverendo pedo porque esta "todo desactivado"
                *
                * */

                // 🔹 Permite acceder libremente a la consola de H2
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll()
                        .anyRequest().authenticated()
                )

                .formLogin(form -> form
                        .loginPage("/login")   // Podés poner tu propia página o usar la default
                        .permitAll()
                )

                // 🔹 Habilitamos logout
                .logout(logout -> logout.permitAll());

        return http.build();
    }
}

