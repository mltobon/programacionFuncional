public class Generico {

    private String nombre;

    public <T extends Number,R extends Number> R verNumero(T numero, R numero2){
        System.out.println("tipo de clase "+numero.getClass());
        return numero2;
    }


}