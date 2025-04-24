package com.example.springbootstart;

import cn.itcast.pojo.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootStartApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringbootStartApplication.class, args);
        Country country = applicationContext.getBean(Country.class);
        System.out.println(country);
        System.out.println(applicationContext.getBean("country"));
    }

}
