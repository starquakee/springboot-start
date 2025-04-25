package com.example.springbootstart.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "email")
@Component
public class EmailProperties {
    private String user;
    private String code;
    private String host;
    private Boolean auth;
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Boolean getAuth() {
        return auth;
    }

    public void setAuth(Boolean auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "EmailProperties{" +
                "user='" + user + '\'' +
                ", code='" + code + '\'' +
                ", host='" + host + '\'' +
                ", auth=" + auth +
                '}';
    }
}

//@Component
//public class EmailProperties {
//    @Value("${email.user}")
//    private String user;
//    @Value("${email.code}")
//    private String code;
//    @Value("${email.host}")
//    private String host;
//    @Value("${email.auth}")
//    private Boolean auth;
//
//    @Override
//    public String toString() {
//        return "EmailProperties{" +
//                "user='" + user + '\'' +
//                ", code='" + code + '\'' +
//                ", host='" + host + '\'' +
//                ", auth=" + auth +
//                '}';
//    }
//}
