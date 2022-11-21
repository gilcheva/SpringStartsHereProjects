package com.sfs._SFS.config;

import com.sfs._SFS.exceptions.ExceptionControllerAdvice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = {"services", "exceptions"})
public class ProjectConfig {

    @Bean
    public ExceptionControllerAdvice aspect() {
        return new ExceptionControllerAdvice();
    }

}

