import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args){

        Generico generico =  new Generico();
        Long numero = generico.verNumero(987L,798L);
        System.out.println("El valor de retorno es: "+numero);


        List<String> stringList = List.of("f","g","c","d","f","d","a","a");
        List<String> stringList2 = List.of("i","j","k","d","f","d","a","a");
        List<String> stringList3 = Stream.of(stringList, stringList2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(stringList3);

        System.out.println(stringList.stream().distinct().collect(Collectors.toList()));

    }
}