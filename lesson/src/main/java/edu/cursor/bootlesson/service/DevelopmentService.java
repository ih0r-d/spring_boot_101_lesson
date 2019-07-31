package edu.cursor.bootlesson.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("DEV")
@Configuration
@Slf4j
public class DevelopmentService {

    public void todo() {
        for (int i = 0; i <10 ; i++) {
            log.debug("Development . . .");
        }
    }
}
