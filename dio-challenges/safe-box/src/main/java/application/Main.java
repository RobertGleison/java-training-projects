package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SafeBox safe;
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        if (type.equals("fisico")) {
            safe = new SafeBox(type);
            System.out.println(safe);
        }
        String password = sc.nextLine();
        String confirmPassword = sc.nextLine();

        if (type.equals("digital")) {
            safe = new DigitalSafeBox(type, password, confirmPassword);
            System.out.println(safe);
        }
        sc.close();
    }
}

class SafeBox {
    private String type;

    public SafeBox(String type) {
        this.type = type;
    }
    public SafeBox() {
    }
    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Tipo: Cofre Fisico" + "\nMetodo de abertura: Chave";
    }
}

class DigitalSafeBox extends SafeBox {
    private String password;
    private String confirmPassword;

    public DigitalSafeBox(String type, String password, String confirmPassword) {
        super(type);
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public DigitalSafeBox(String type) {
        super(type);
    }
    public String getPassword() {
        return password;
    }
    public String getConfirmPassword() {
        return confirmPassword;
    }
    public String matchPasswords() {
        if (this.password.equals(this.confirmPassword))
            return "Cofre aberto!";
        else return "Senha incorreta!";
    }
    @Override
    public String toString() {
        return "Tipo: Cofre Digital" + "\nMetodo de abertura: Senha\n" + matchPasswords();
    }
}