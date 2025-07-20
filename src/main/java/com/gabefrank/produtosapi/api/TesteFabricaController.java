package com.gabefrank.produtosapi.api;

import com.gabefrank.produtosapi.CarroStatus;
import com.gabefrank.produtosapi.model.Chave;
import com.gabefrank.produtosapi.model.ChevroletAstra;
import com.gabefrank.produtosapi.model.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")

public class TesteFabricaController {
    @Autowired
    @Qualifier("aspirado")
    private Motor motor;

    @PostMapping
    public CarroStatus iniciarCarro(@RequestBody Chave chave){
        var carro = new ChevroletAstra(motor);
        return carro.darIgnicao(chave);
    }
}
