package hu.alerant.demo.rest;

import hu.alerant.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestEndpoint {

    private final TestService service;

    public TestEndpoint(@Autowired TestService service) {
        this.service = service;
    }

    @GetMapping(path = "/hello")
    public String hello(String name){
        return service.helloTo(name);
    }

    @GetMapping(path = "/secret")
    public ResponseEntity<String> secretCheck(String secret){
        if(service.checkSecret(secret))
            return ResponseEntity.ok("The secret was guessed correctly!");
        else
            return ResponseEntity.badRequest().body("The secret was not guessed correctly!");
    }

}
