package com.gabefrank.produtosapi.configuration;

import com.gabefrank.produtosapi.model.Motor;
import com.gabefrank.produtosapi.model.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "aspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(140);
        motor.setCilindros(4);
        motor.setModelo("Familia 2");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "eletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(90);
        motor.setCilindros(0);
        motor.setModelo("E47");
        motor.setLitragem(0.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "turbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("TSI");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
