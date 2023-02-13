
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class CollectionUtils {
    public static <T,R> List<R> transformar(List<T> list, Predicate<T> validacion){
        List<R> result = new ArrayList<>();
        for(T valor: list){
            if(validacion.test(valor)) {
                result.add((R)valor);
            }
        }
        return result;
    }

    public static <T,R> List<R> aplicar(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T valor: list){
            result.add(function.apply(valor));
        }
        return result;
    }

    public static <T> List<T> llenarValores(Supplier<T> supplier, int cantidad){
        List<T> result = new ArrayList<>();
        for (int i= 0; i<cantidad; i++){
            result.add(supplier.get());
        }
        return result;
    }

    public static <T> List<T> useConsumer(Consumer<T> consumer){
     return null;
    }

}
