package GroupProject;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("mail@yahoo.com");
        System.out.println("Your email is "+registration.getEmail());
        registration.setUserName("Yul");
        System.out.println("Your username is "+registration.getUserName());
        registration.setPassword("123456M", "Yul");
        System.out.println("Your password is "+registration.getPassword());
    }
}

