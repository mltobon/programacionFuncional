public class Main2 {

    public static void main(String args[]){

        Generico generico =  new Generico();
        Long numero = (Long) generico.verNumero(987L,798L);
        System.out.println("El valor de retorno es: "+numero);

    }
}