import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter you Age: ");
        int age=scanner.nextInt();
        if(age<13){
            System.out.println("You are a child.");
        } else if(age>=13 && age<20){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }
        scanner.close();
    }
}
