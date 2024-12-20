package com.api.agenda;
//classe de teste para o projeto, para ver se ta funcional
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HeloTest {

    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo!";
    }
}
