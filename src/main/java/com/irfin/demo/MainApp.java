/*
 * MainApp.java
 *
 * Created on Dec 31, 2022, 16.53
 */
package com.irfin.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Irfin A.
 */
@SpringBootApplication
public class MainApp implements CommandLineRunner
{
    public static void main(String[] args)
    {
        SpringApplication.run(MainApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {

    }
}
