import java.util.Random;
import java.util.Scanner;

public class lucky_draw {
    public static void main(String[] args) {
        System.out.println("Lucky draw");
        Scanner sc = new Scanner(System.in);
        Random xyz=new Random();
        int luckynum=xyz.nextInt(101);

        System.out.println("Try your luck with a random nmber from 0-100:");
        int number = sc.nextInt();

        if(number == luckynum){
            System.out.println("You have won the lottery");
        }
        else{
            System.out.println("loser");
        }
    }

}
