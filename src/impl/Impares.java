package impl;

import interfaces.Validacion;

public class Impares implements Validacion {
    @Override
    public boolean test(Integer valor) {
        return valor%2!=0?true:false;
    }
}
