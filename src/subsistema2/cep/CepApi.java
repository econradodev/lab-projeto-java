package subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super ();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        if (cep.equalsIgnoreCase("40725680")) {
            return "SALVADOR";
        } else {
            return "CIDADE A";
        }
    }
    public String recuperarEstado (String cep) {
        return "BAHIA";
    }
    public String recuperarPais (String pais) {
        return pais;
    }
}
