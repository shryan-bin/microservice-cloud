package com.ryan.cloud.feign;

import com.ryan.config.MyCustomizationFeign;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "microservice-user-provider", configuration = MyCustomizationFeign.class)
public interface MovieFeignClient {

//    @RequestMapping(value = "/user/name",method = RequestMethod.GET)
//    public String sayHello(@RequestParam("name") String name);

    @RequestLine("GET /user/name")
    String sayHello(@Param("name") String name);


}