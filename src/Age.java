import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age");
        int a = sc.nextInt();
        if(a==17){
            System.out.println("hello");
        }
        else {
            System.out.println("Not same age");
        }


    }
}
