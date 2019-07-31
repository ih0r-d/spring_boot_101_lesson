package com.demo.bootstarter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
//@Service
@NoArgsConstructor
@AllArgsConstructor
public class GreetingServiceImpl implements GreetingService {

    private GreetingsProperties greetingsProperties;

    @Override
    public void greet() {
        String name = greetingsProperties.getName() == null
                ? System.getProperty("user.name")
                : greetingsProperties.getName();

        log.info("Hello, Dear - {}", name);
    }
}
