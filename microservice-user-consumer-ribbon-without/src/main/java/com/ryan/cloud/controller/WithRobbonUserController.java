package com.ryan.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/without")
public class WithRobbonUserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name){

        String url = "http://microservice-user-provider/user/name?name={userName}";
        Map<String, String> parasMap =  new HashMap<String, String>();
        parasMap.put("userName",name);
        String result = restTemplate.getForObject(url,String.class,parasMap);

        return result;

    }
}
