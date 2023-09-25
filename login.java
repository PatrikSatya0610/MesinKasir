import java.util.Scanner;

public class login{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String username, password;

        //username = "kelompok3oke";
        //password = "123456";

        System.out.print("Enter Username : ");
        username = input.next();
        System.out.print("Enter Password : ");
        password = input.next();

        if (username.equals(username) && password.equals(password)) {
            System.out.println("Login successful!");
        } else if (username.equals(username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }
    
    }
}