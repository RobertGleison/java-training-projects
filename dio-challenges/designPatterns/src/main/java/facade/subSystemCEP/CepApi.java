package facade.subSystemCEP;

public class CepApi {
    private static CepApi cep = new CepApi();

    private CepApi() {
    }

    public static CepApi getCep() {
        return cep;
    }

    public String getCity(String cep){
        return "Belo Horizonte";
    }
    public String getAdessState(String cep){
        return "Minas Gerais";
    }
}
