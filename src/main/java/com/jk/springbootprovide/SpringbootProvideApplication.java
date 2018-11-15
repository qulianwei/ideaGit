package com.jk.springbootprovide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-dubbo-provider.xml")
public class SpringbootProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProvideApplication.class, args);
    }
}
