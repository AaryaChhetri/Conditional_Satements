import java.util.Scanner;

public class Positive_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("number is positive");
        }
        else if(a==0) {
            System.out.println("number is 0");
        }
        else{
            System.out.println("number is negative");
        }
    }
}
