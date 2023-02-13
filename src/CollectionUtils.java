import interfaces.Validacion;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {
    public static List<Integer> transformar(List<Integer> list, Validacion validacion){
        List<Integer> result = new ArrayList<>();
        for(Integer valor: list){
            if(validacion.test(valor)) {
                result.add(valor);
            }
        }
        return result;
    }

}
