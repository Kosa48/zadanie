public class Main {
    public static void main(String[] args) {

        loginService loginService = new loginService();
        loginService.login("user1", "password123");
        loginService.login("email@example.com","User1" , "password456");
        loginService.login("user3", 123456);
        loginService.login(123456789, 21341412);


        User admin = new Admin();
        User programmer = new Programmer();
        User tester = new Tester();
        User manager = new Manager();

        System.out.println("Admin: " + admin.getAccessLevel());
        System.out.println("Programmer: " + programmer.getAccessLevel());
        System.out.println("Tester: " + tester.getAccessLevel());
        System.out.println("Manager: " + manager.getAccessLevel());
    }
}
