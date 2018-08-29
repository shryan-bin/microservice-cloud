package com.ryan.cloud.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.ryan.cloud.annotation.ExcludedTargetClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludedTargetClass
public class MyRibbonConfiguration {

    LoadBalancerClient loadBalancerClient;

    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

}
