package com.example.springbootstart;

import cn.itcast.pojo.Country;
import com.example.springbootstart.pojo.EmailProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootStartApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringbootStartApplication.class, args);
        Country country = (Country) applicationContext.getBean("country");
        System.out.println(country);
        EmailProperties emailProperties = applicationContext.getBean(EmailProperties.class);
        System.out.println(emailProperties);
    }

}
