import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter username: ");
        String username=scanner.nextLine();
        System.out.print("Enter password: ");
        String password=scanner.nextLine();
        scanner.close();
        if(username.equals("admin")&&password.equals("admin123")){
            System.out.println("Login successful.");
        } else{
            System.out.println("Invalid username or password.");
        }
    }    
}
