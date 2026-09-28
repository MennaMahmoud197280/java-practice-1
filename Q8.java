import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the price");
        double price=scanner.nextDouble();
        if(price>=2000){
            price=price*20/100;
            System.out.println("the price after discount is "+price);
        }else if(price>=1000){
            price=price*10/100;
            System.out.println("the price after discount is "+price);
        }else{
            System.out.println("no discount");
        }
        scanner.close();
    }
}
