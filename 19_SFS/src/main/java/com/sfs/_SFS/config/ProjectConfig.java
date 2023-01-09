package com.sfs._SFS.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.sfs._SFS.proxy")
public class ProjectConfig {
}