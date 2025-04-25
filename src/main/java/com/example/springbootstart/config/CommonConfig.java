package com.example.springbootstart.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {
    @ConditionalOnProperty(prefix = "country", name = {"name", "system"}) // name和system都存在，才加载
    @Bean
    public Country country(@Value("${country.name}") String name, @Value("${country.system}") String system) {
        Country country = new Country();
        country.setName(name);
        country.setSystem(system);
        return country;
    }
    @Bean
    @ConditionalOnMissingBean(Country.class) // Country不存在，才加载
    public Province province() {
        return new Province();
    }
}
