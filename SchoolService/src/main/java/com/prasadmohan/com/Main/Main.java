package com.prasadmohan.com.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Spring Application Start point
 *
 */
@SpringBootApplication
@ComponentScan("com.prasadmohan.com.*")
@ImportResource("classpath:aop-context.xml")
public class Main 
{
	public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(Main.class, args);
    }
}
