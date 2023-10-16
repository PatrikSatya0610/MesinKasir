import java.util.Scanner;

public class login{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String username, password, secretUsername = "kelompok3oke", secretPassword = "123456";

        System.out.print("Enter Username : ");
        username = input.nextLine();
        System.out.print("Enter Password : ");
        password = input.nextLine();

        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login sukses");
        } else {
            System.out.println("Login Gagal");
            System.exit(0);
        }     
    }
}