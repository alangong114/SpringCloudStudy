package com.example.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alan on 2018/1/18.
 */
@RestController
public class HelloController {

    @Autowired
    public HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
