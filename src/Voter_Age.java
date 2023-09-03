import java.util.Scanner;

public class Voter_Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int a = sc.nextInt();

        if (a >= 18){
            System.out.println("Voter eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
