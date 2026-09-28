import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numb=scanner.nextInt();
        if(numb>0){
            System.out.println("The number is positive.");
        } else if(numb<0){
            System.out.println("The number is negative.");
        } else{
            System.out.println("The number is zero.");
        }
        scanner.close();
    }
} 