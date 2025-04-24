package com.example.springbootstart.config;

import cn.itcast.pojo.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {
    @Bean
    public Country country(){
        return new Country();
    }
}
