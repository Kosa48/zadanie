public class loginService {

    public void login(String username, String password) {
        System.out.println("Logowanie za pomocą nazwy uzytkownika i hasła.");
    }

    public void login (String email, String username ,  String password) {
        System.out.println("Logowanie za pomocą e-maila , nazwy uzytkownika i  hasła.");
    }

    public void login(String username, int token) {
        System.out.println("Logowanie za pomocą nazwy uzytkownika i tokenu.");
    }

    public void login(int phoneNumber, int pin ) {
        System.out.println("Logowanie za pomocą numeru telefonu i pinu.");
    }
}
