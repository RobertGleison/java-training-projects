package facade;

import facade.subSystemCEP.CepApi;
import facade.subSystemCRM.CrmService;

public class Facade {
    public void clientMigration(String name, String cep){
        String city = CepApi.getCep().getCity(cep);
        String adressState = CepApi.getCep().getAdessState(cep);
        CrmService.saveClient(name, cep, city, adressState);
    }

}
