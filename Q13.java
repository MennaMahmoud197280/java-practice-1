import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unit=scanner.nextInt();
        double billAmount;
        if(unit<=100){
            billAmount=unit*1.5;
        }
        else if(unit>100&&unit<=200){
            billAmount=(100 * 1.5) + ((unit - 100) * 2.5);
        }
        else{
            billAmount=(100 * 1.5) + (100 * 2.5) + ((unit - 200) * 4);
        }
        System.out.println("The electricity bill amount is: $" + billAmount);
        scanner.close();
    }
}
