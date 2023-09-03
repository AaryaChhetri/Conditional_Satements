import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("number is even");
        }
        else if(a==0){
            System.out.println("the number is 0");
        }
        else {
            System.out.println("number is odd");
        }

    }
}
