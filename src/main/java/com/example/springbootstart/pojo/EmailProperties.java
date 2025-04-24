package com.example.springbootstart.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "email")
@Component
public class EmailProperties {
    public String user;
    public String code;
    public String host;
    public Boolean auth;

}
