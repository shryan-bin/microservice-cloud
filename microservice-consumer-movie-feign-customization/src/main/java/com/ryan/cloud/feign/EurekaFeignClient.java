package com.ryan.cloud.feign;

import com.ryan.config.SecurityCustomizationFeign;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "whatever", url = "http://localhost:8761/", configuration = SecurityCustomizationFeign.class)
public interface EurekaFeignClient {

    @RequestMapping(path = "/eureka/apps/{serverName}", method = RequestMethod.GET)
    String findServerInfoFromEureka(@PathVariable("serverName") String serverName);

}
