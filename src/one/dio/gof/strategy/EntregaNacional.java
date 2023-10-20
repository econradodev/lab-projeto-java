package one.dio.gof.strategy;

public class EntregaNacional implements Comportamento{

    @Override
    public void tipoEntrega() {
        System.out.println("ENTREGA NACIONAL...");
    }
}
