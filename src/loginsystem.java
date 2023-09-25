import java.util.Scanner;

public class loginsystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String static_username="Prijom";
        String static_password="1233";
        for (int i = 5; i >0 ; i--) {
            System.out.println("Enter your name");
            String username= sc.next();
            System.out.println("Enter your password");
            String password= sc.next();
            if (static_username.equals(username)& static_password.equals(password)){
                System.out.println("Your are logged in");
                break;
            }
            else {
                System.out.println("Invalid Username password. Please try again later");

            }
        }
    }
}