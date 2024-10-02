package edu.ucaldas.buscadorIA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuscadorIaApplication {
    public static void main(String[] args) {
      SpringApplication.run(BuscadorIaApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Hola hola mundo") String name) {
      return String.format("Hello %s!", name);
    }
}
