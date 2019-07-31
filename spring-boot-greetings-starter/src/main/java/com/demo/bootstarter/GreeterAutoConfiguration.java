package com.demo.bootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(GreetingService.class)
@EnableConfigurationProperties(GreetingsProperties.class)
public class GreeterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }


}
