package facade.subSystemCRM;

public class CrmService {

    private CrmService() {
    }

    public static void saveClient(String name, String cep, String adressState, String city){
        System.out.println("Saved client in CRM system");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(adressState);
        System.out.println(city);
    }
}
