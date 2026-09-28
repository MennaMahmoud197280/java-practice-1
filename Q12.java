import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance =5000;
        int operation;
        double amount;
        boolean tryAgain = true;
        System.out.println("Welcome to the ATM!");
        do{
            System.out.println("Please select an operation: \n1 -> Check Balance \n2 -> Withdraw \n3 -> Deposit");
        operation = scanner.nextInt();
        switch(operation){
            case 1:
                System.out.println("Your current balance is: $" + balance);
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: $");
                amount = scanner.nextDouble();
                if(amount > balance){
                    System.out.println("Error: Insufficient funds. Your current balance is: $" + balance);
                } else {
                    balance -= amount;
                    System.out.println("Withdrawal successful! Your new balance is: $" + balance);
                }
                break;
            case 3:
                System.out.print("Enter the amount to deposit: $");
                amount = scanner.nextDouble();
                balance += amount;
                System.out.println("Deposit successful! Your new balance is: $" + balance);
                break;
            default:
                System.out.println("Invalid operation. Please try again.");

        }
        System.out.print("Do you want to perform another operation? (yes/no): ");
        String response = scanner.next();
        if(response.equalsIgnoreCase("no")){
            tryAgain = false;
            System.out.println("Thank you for using the ATM!");
        }
        }while(tryAgain);
        


        scanner.close();
    }
}
