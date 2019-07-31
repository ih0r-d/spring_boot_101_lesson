package io.cursor.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class DevelopmentProfilerEnvironmentBeanPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length ==0 && !System.getenv().get("OS").contains("Windows")) {
            environment.addActiveProfile("DEV");
        }
    }
}
