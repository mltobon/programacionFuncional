package interfaces;

import java.util.Random;

@FunctionalInterface
public interface Validacion {
    boolean test(Integer valor);

    static int getNumber(){
        return new Random().nextInt();
    }

}
