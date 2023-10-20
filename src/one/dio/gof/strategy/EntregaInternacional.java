package one.dio.gof.strategy;

public class EntregaInternacional implements Comportamento{

    @Override
    public void tipoEntrega() {
        System.out.println("ENTREGA INTERNACIONAL...");
    }
}
