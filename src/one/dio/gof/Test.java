package one.dio.gof;

import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.strategy.*;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        //Strategy

        System.out.println("Digite 'NACIONAL' para entregas nacionais ou 'INTERNACIONAL' para entregas internacionais: ");
        Scanner scanner = new Scanner(System.in);
        String entrega = scanner.next();

        Comportamento entregaNacional = new EntregaNacional();
        Comportamento entregaInternacional = new EntregaInternacional();
    //Sistema
        if (entrega.equalsIgnoreCase("NACIONAL")) {
            Correio correio = new Correio();
            Facade facade = new Facade();

            correio.setComportamento(entregaNacional);
            correio.tipoEntrega();

            System.out.println("DIGITE SEU NOME");
            String nome = scanner.next();
            System.out.println("DIGITE O CEP DO DESTINATÁRIO");
            String cep = scanner.next();

            facade.migrarCliente(nome, cep);

        } else if (entrega.equalsIgnoreCase("INTERNACIONAL")) {
            Correio correio = new Correio();
            Facade facade = new Facade();

            correio.setComportamento(entregaInternacional);
            correio.tipoEntrega();

            System.out.println("DIGITE SEU NOME");
            String nome = scanner.next();
            System.out.println("DIGITE O CÓDIGO POSTAL DO DESTINATÁRIO");
            String cep = scanner.next();
            System.out.println("DIGITE O PAÍS DO DESTINATÁRIO");
            String pais = scanner.next();

            facade.migrarClienteInternacional(nome, cep, pais);
        }


    }
}
