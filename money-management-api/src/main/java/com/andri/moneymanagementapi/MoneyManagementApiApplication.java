package com.andri.moneymanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MoneyManagementApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyManagementApiApplication.class, args);
    }

}
