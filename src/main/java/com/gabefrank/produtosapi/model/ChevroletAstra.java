package com.gabefrank.produtosapi.model;

import java.awt.*;

public class ChevroletAstra extends Carro{
    public ChevroletAstra(Motor motor)
    {
        super(motor);
        setModelo("Astra");
        setCor(Color.BLACK);
        setMontadora(Montadora.CHEVROLET);
    }
}
