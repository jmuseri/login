package com.jmuseri.login.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
    
//	 Bean name must be "multipartResolver", by default Spring uses method name as bean name.
//    @Bean
//    public MultipartResolver multipartResolver() {
//    	
//    	CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//    	resolver.setMaxUploadSize(3000000);
//        return resolver;
//    }

	/*
	// if the method name is different, you must define the bean name manually like this :
	@Bean(name = "multipartResolver")
    public MultipartResolver createMultipartResolver() {
        return new StandardServletMultipartResolver();
    }*/

}
