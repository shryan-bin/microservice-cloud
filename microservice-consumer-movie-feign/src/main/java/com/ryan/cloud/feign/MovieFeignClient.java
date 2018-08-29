package com.ryan.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("microservice-user-provider")
public interface MovieFeignClient {

    @RequestMapping(value = "/user/name",method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name);


}