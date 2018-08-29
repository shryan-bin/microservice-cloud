package com.ryan.cloud.controller;

import com.ryan.cloud.feign.EurekaFeignClient;
import com.ryan.cloud.feign.MovieFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieFeignClient movieFeignClient;

    @Autowired
    private EurekaFeignClient eurekaFeignClient;

    @GetMapping("/sample")
    public String say(@RequestParam String name) {
        System.out.println("movie.feign.username=" + name);
        return movieFeignClient.sayHello(name);
    }

    @GetMapping("/test")
    public String test(@RequestParam String testName) {
        return "test:" + testName;
    }

    @GetMapping("/server/list/{serverName}")
    public String getServerInformation(@PathVariable String serverName) {
        return eurekaFeignClient.findServerInfoFromEureka(serverName);
    }
}
