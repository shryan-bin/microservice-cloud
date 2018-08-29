package com.ryan.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/name")
    public String sayHello(@RequestParam String name) {
        System.out.println("8701 name:"+name);
        return "Hello aaa " + name;
    }
}
