import java.util.Scanner;

public class fizz_or_buzz {
    public static void main(String[] args) {
        System.out.println("Buzz or Fizz");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();



        if(number % 3 == 0 ){

            System.out.println("fizz");
        }else{
            System.out.println(number);
        }
        if(number % 5 == 0 ){
            System.out.println("buzz");
        }else{
            System.out.println(number);
        }

    }
}
