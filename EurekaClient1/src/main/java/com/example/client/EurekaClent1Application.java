package com.example.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClent1Application
{

    @Value("${server.port}")
    String port;

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaClent1Application.class, args);
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name)
    {
        return "Hi " + name + ",i am from port:<span style='color:purple'>" + port + "</span>";
    }
}
