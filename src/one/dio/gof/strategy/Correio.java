package one.dio.gof.strategy;

import java.util.Scanner;

public class Correio {


    private Comportamento comportamento;
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void tipoEntrega() {
        comportamento.tipoEntrega();
    }

}
