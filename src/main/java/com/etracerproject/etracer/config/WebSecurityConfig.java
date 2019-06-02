/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etracerproject.etracer.config;

import com.etracerproject.etracer.repositories.EmployeeRepository;
import com.etracerproject.etracer.services.EmployeeService;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 *
 * @author Relion31
 */
@Configuration
//@EnableWebSecurity
public class WebSecurityConfig {
 
//    String[] resources = new String[]{
//        "/include/**", "/css/**", "/icons/**", "/img/**", "/js/**", "/layer/**"
//    };
//    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers(resources).permitAll()
//                .antMatchers("/", "/index").permitAll()
//                .antMatchers("/admin/*").hasRole("ADMIN")
//                .antMatchers("/trainer/*").hasRole("TRAINER")
//                .antMatchers("/user/*").hasRole("USER")
//                .antMatchers("/manager/*").hasRole("MANAGER")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                
//                .defaultSuccessUrl("/dashboard")
//                
//                .failureUrl("/login?error=true")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .and()
//                .rememberMe().rememberMeParameter("my-remember-me")
//                .tokenRepository(PersistentTokenRepository())
//                .userDetailsService(employeeService).and()
//                .logout()
//                .permitAll()
//                .deleteCookies("JSESSIONID")
//                .logoutSuccessUrl("/login?logout")
//                .and().csrf().disable();
//    }
//    BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    //Crea el encriptador de contraseñas	
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
////El numero 4 representa que tan fuerte quieres la encriptacion.
////Se puede en un rango entre 4 y 31. 
////Si no pones un numero el programa utilizara uno aleatoriamente cada vez
////que inicies la aplicacion, por lo cual tus contrasenas encriptadas no funcionaran bien
//        return bCryptPasswordEncoder;
//    }
//    
//  @Autowired
//    EmployeeService employeeService;
//
//    //Registra el service para usuarios y el encriptador de contrasena
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        // Setting Service to find User in the database.
//        // And Setting PassswordEncoder
//        auth.userDetailsService(employeeService).passwordEncoder(passwordEncoder());
//    }
//    @Autowired
//    DataSource dataSource;
//
//    @Bean
//    public PersistentTokenRepository PersistentTokenRepository() {
//        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
//        tokenRepository.setDataSource(dataSource);
//        return tokenRepository;
//    }
    
}
