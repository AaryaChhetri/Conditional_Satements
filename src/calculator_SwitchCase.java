import java.util.Scanner;

public class calculator_SwitchCase {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("SN" + " " + "Add" + " " + "+");
        System.out.println("1" + " " + "Subtract" + " " + "-");
        System.out.println("2" + " " + "Multiply" + " " + "*");
        System.out.println("3" + " " + "Divide" + " " + "/");
        double Result = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double first_number = sc.nextDouble();
        System.out.println("Enter the second number:");
        double second_number = sc.nextDouble();
        System.out.println("Enter a mathematical operation:");
        String operator  = sc.next();

        switch (operator){
            case "+":
                Result = first_number+second_number ;
                break;

            case "-":
                Result = first_number-second_number ;
                break;

            case "*":
                Result = first_number*second_number ;
                break;

            case "/":
                Result = first_number/second_number ;
                break;

            case "%":
                Result = first_number%second_number ;
                break;

            default:
                System.out.println("Invalid operator");
        }
        System.out.println("The requred answer is "+ Result);

    }
}
