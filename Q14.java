import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product;
        int amount;
        int price;
        int total;
        int finalPrice;
        System.out.println("Select a product : \n1 -> Laptop = 30000. \n2 -> Phone = 20000. \n3 -> Tablet = 15000.");


        product = scanner.nextInt();
        switch (product) {
            case 1->{
                price=30000;
                System.out.print("Enter the amount of product you want to buy: ");
                amount = scanner.nextInt();
                total=price*amount;
                if(total>50000){
                    finalPrice=total-(total*10/100);
                    System.out.println("The total price after discount is: " + finalPrice);
                }
                else{
                    System.out.println("The total price is: " + total);
                }
            }
            case 2->{
                price=20000;
                System.out.print("Enter the amount of product you want to buy: ");
                amount = scanner.nextInt();
                total=price*amount;
                if(total>50000){
                    finalPrice=total-(total*10/100);
                    System.out.println("The total price after discount is: " + finalPrice);
                }
                else{
                    System.out.println("The total price is: " + total);
                }
            }
            case 3->{
                price=15000;
                System.out.print("Enter the amount of product you want to buy: ");
                amount = scanner.nextInt();
                total=price*amount;
                if(total>50000){
                    finalPrice=total-(total*10/100);
                    System.out.println("The total price after discount is: " + finalPrice);
                }
                else{
                    System.out.println("The total price is: " + total);
                }
            }
            
        }
        scanner.close();
    }
}
