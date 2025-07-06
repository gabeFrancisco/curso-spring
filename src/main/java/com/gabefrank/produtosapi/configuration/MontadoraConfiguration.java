package com.gabefrank.produtosapi.configuration;

import com.gabefrank.produtosapi.model.Motor;
import com.gabefrank.produtosapi.model.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(140);
        motor.setCilindros(4);
        motor.setModelo("Familia 2");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
}
