package interfaces;

import java.util.Random;

@FunctionalInterface
public interface Validacion<T> {
    boolean test(T valor);

    static int getNumber(){
        return new Random().nextInt();
    }

}
