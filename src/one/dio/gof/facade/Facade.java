package one.dio.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

    public void migrarClienteInternacional(String nome, String cep, String paisDestino) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        String pais = CepApi.getInstancia().recuperarPais(paisDestino);

        CrmService.gravarClienteInternacional(nome, cep, pais);
    }
}
