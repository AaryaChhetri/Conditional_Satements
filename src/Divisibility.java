import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();

        if(a%3==0){
            System.out.println("number is divisible");
        }
        else {
            System.out.println("Not divisible");
        }
    }
}
