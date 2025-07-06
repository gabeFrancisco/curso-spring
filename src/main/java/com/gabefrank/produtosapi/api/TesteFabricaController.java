package com.gabefrank.produtosapi.api;

import com.gabefrank.produtosapi.model.Carro;
import com.gabefrank.produtosapi.model.Chave;
import com.gabefrank.produtosapi.model.ChevroletAstra;
import com.gabefrank.produtosapi.model.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {
    @Autowired
    private Motor motor;

    public void iniciarCarro(@RequestBody Chave chave){
        var carro = new ChevroletAstra(motor);
    }
}
