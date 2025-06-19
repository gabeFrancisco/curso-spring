package com.gabefrank.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProdutosApiApplication {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "The system is now working gooooood!";
    }

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
	}
}
