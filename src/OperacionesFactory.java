import enums.Operaciones;
import impl.Impares;
import impl.Pares;
import interfaces.Validacion;

public class OperacionesFactory {
    public static Validacion getOperacionInstance(Operaciones operacion){
        return switch (operacion){

            case PARES -> new Pares();
            case IMPARES -> new Impares();
            case PRIMOS -> null;
        };
    }
}
