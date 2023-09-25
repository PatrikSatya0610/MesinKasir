import java.util.Scanner;

public class login{

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        String username;
        int password;

        System.out.println("*** LOGIN ***");
        System.out.print("Username\t:");
        username = input.nextLine();
        System.out.print("Password\t:");
        password = input.nextInt();
    }
}