package com.orange.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CmsApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CmsApplication.class, args);

//        SpringApplication springApplication = new SpringApplication(CmsApplication.class);
//
//        springApplication.setBanner(((environment, sourceClass, out) -> {
//            out.println("======= Welcome to Orange CMS =======");
//        }));
//
//        springApplication.run(args);
    }
}
