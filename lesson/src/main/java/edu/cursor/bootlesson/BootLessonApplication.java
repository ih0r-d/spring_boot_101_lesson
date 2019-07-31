package edu.cursor.bootlesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootLessonApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootLessonApplication.class, args);
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//
//        }
    }

}
