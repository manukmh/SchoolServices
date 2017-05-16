package com.prasadmohan.com.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Application Start point
 *
 */
@SpringBootApplication
@ComponentScan("com.prasadmohan.com.*")
public class Main 
{
 static 
    {
        SpringApplication.run(Main.class);
    }
}
