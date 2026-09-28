import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter you marke: ");
        int mark=scanner.nextInt();

        if(mark>=60&&mark<=100){
            System.out.println("Passed");
        }
        else if(mark<0||mark>100){
            System.out.println("Invalid marke");
        }
        else{
            System.out.println("Failed");
        }
        scanner.close();
    }
}
