package com.ryan.cloud.constroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ribbon/property")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String sayHello(@RequestParam String name) throws Exception {
        String url = "http://microservice-user-provider/user/name?name={userName}";

        Map<String,String> map = new HashMap<String, String>();
        map.put("userName", name);

        String responseEntity = restTemplate.getForObject(url,String.class,map);

        return responseEntity;
    }
}
