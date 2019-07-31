package edu.cursor.bootlesson.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;

@Data
@EqualsAndHashCode
@ToString(of = "{username, email}")
@Slf4j
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;


    private BufferedReader bufferedReader;

    public void sayHello(String name) {
        log.debug("Hello, {}",name);
    }

}

