package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class AppConfig {

    @Value("${database.url}")
    private String dataBaseName;

    @Value("${database.username}")
    private String databaseUser;

    @Value("${database.password}")
    private String databasePassword;

    public AppConfig() {
        System.out.println("AppConfig constructor: " + dataBaseName + " " + databaseUser + " " + databasePassword);
    }

    @PostConstruct
    public void init() {
        System.out.println("AppConfig post construct: " + dataBaseName + " " + databaseUser + " " + databasePassword);
    }

    /*@Bean
    public ServiceBean springBean2() {
        return new ServiceBean();
    }*/

    @PreDestroy
    void destroy() {
        System.out.println("AppConfig destroy method");
    }
}
