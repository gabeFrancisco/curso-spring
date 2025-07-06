package com.gabefrank.produtosapi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
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
//        SpringApplication.run(ProdutosApiApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ProdutosApiApplication.class);
        builder.bannerMode(Banner.Mode.OFF);

        builder.run(args);
	}
}
