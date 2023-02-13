import enums.Operaciones;
import impl.Impares;
import impl.Pares;
import interfaces.Validacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> pares = pares(numeros);
        System.out.println("Los numeros pares son " + pares);
        List<Integer> imparesA = imPares(numeros);
        System.out.println("Los numeros pares son " + imparesA);

        List<Integer> testIntefaz = CollectionUtils.transformar(numeros, valor -> valor%2==0?true:false);
        System.out.println("Los numeros pares son " + testIntefaz);
    }

    public static List<Integer> pares(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers){
            if(number % 2 ==0){
                result.add(number);
            }
        }
        return result;
    }

    public static Validacion getOperacion(Operaciones operacion){
        return OperacionesFactory.getOperacionInstance(operacion);
    }
    public static List<Integer> imPares(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers){
            if(number % 2 !=0){
                result.add(number);
            }
        }
        return result;
    }
}