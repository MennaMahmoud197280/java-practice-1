import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        num3 = scanner.nextInt();
        scanner.close();

        if(num1>=num2&&num1>=num3){
            System.out.println(num1+" is the largest number.");

        }
        else if(num2>=num1&&num2>=num3){
            System.out.println(num2+" is the largest number.");
        }
        else{
            System.out.println(num3+" is the largest number.");
        }
    }
}
