package com.spring;

import com.spring.service.DataSetup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringApplicationMain implements CommandLineRunner {

    @Autowired
    private ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationMain.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        DataSetup dataSetup = appContext.getBean(DataSetup.class);
        System.out.println(dataSetup.CustomerDataSetup());
    }
}
