package com.example.feign;

import org.springframework.stereotype.Component;

/**
 * Created by Alan on 2018/1/24.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry  "+name;
    }
}
