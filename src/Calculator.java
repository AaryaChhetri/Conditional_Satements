import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("SN" + " " + "Add" + " " + "+");
        System.out.println("1" + " " + "Subtract" + " " + "-");
        System.out.println("2" + " " + "Multiply" + " " + "*");
        System.out.println("3" + " " + "Divide" + " " + "/");

        double first_no, second_no, result = 0;
        String math_operation;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        first_no = sc.nextDouble();
        System.out.println("Enter a mathematical operation:");
        math_operation = sc.next();
        System.out.println("Enter the second number:");
        second_no = sc.nextDouble();


        if (math_operation.equals("+")) {
            result = first_no + second_no;

        } else if (math_operation.equals("-")) {
            result = first_no - second_no;

        } else if (math_operation.equals("*")) {
            result = first_no * second_no;

        } else if (math_operation.equals("/")) {
            result = first_no / second_no;

        } else {
            System.out.println("Invalid mathematical operation.");
        }
        System.out.println("The requred answer is "+ result);
    }

}

