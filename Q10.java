import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numb1;
        double numb2;
        String operator;
        boolean validOperator = true;
        System.out.print("Enter first number: ");
        numb1 = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Select an operator (+, -, *, /, %, ^): ");
        operator = scanner.nextLine();
        System.out.print("Enter second number: ");
        numb2 = scanner.nextDouble();
        scanner.close();
        double result=0;
        switch (operator) {
            case "+"-> result = numb1 + numb2;
            case "-"-> result = numb1 - numb2;
            case "*"-> result = numb1 * numb2;
            case "/"-> {
                if(numb2 != 0){
                    result = numb1 / numb2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
            }
            case "%"-> result = numb1 % numb2;
            case "^"-> result = Math.pow(numb1, numb2);
            default -> {
                System.out.println("Error: Invalid operator.");
                validOperator = false;
            }
        }
        if(validOperator){
            System.out.println("The result is: " + result);
        }else{
            System.out.println("Calculation could not be performed due to invalid input.");
        }

    }
}
 