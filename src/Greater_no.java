import java.util.Scanner;

public class Greater_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + " " + "is greater");
        }
        else if (a == b){
            System.out.println("both are same");
        }
        else{
            System.out.println(b + " " + "is greater");
        }
    }
}
