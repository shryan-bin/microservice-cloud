package com.ryan.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/hello")
    public String sayHello(@RequestParam String name){
        String url = "http://microservice-user-provider/user/name?name={userName}";

        Map<String,String> map = new HashMap<String, String>();
        map.put("userName", name);

        String returnName = restTemplate.getForObject(url,String.class, map);

        return returnName;
    }

}
