package hu.alerant.demo.service;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Log
public class TestService {

    private static final String HELLO = "Hello";
    private static final String SECRET = "PASSWORD";

    public String helloTo(String name){
        log.info("Saying hello to " + name);
        return HELLO + " " + name;
    }

    public boolean checkSecret(String secret){
        log.info("Checking secret...");
        return Objects.equals(secret, SECRET);
    }

}
