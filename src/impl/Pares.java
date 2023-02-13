package impl;

import interfaces.Validacion;

import java.util.Random;

public class Pares implements Validacion {
    @Override
    public boolean test(Integer valor) {
        return valor%2==0?true:false;
    }

    public int getValor(){
        return new Random().nextInt(10);
    }
}
