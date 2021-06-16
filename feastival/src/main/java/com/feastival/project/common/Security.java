package com.feastival.project.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Security extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()//보호된 리소스 URI에 접근할 수 있는 권한을 설정
//                .antMatchers("/test*/**").permitAll() //전체 접근 허용
                .antMatchers("/logout/**").permitAll()
//                .antMatchers("/myPage").hasRole("ADMIN")//admin이라는 롤을 가진 사용자만 접근 허용
                .anyRequest()
                .authenticated()
                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessHandler(logoutSuccessHandler())
//                .and()
//                .csrf()//csrf 보안 설정을 비활성화 .disable()//해당 기능을 사용하기 위해서는 프론트단에서 csrf토큰값 보내줘야함
//                .addFilter(jwtAuthorizationFilter())//Header 인증에 사용되는 BasicAuthenticationFilter 구현체를 등록
                .exceptionHandling();
//                .accessDeniedHandler(accessDeniedHandler())
//                .authenticationEntryPoint(authenticationEntryPoint());
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}

/*
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
​
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/", "/hello").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .and()
            .httpBasic();
    }
}


출처: https://ict-nroo.tistory.com/118 [개발자의 기록습관]
 */