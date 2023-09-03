import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of  day of the week");
        int enetered_day = sc.nextInt();

        switch (enetered_day){
            case 1,7,6:
                System.out.println("weekend");
                break;
            case 2,3,4,5:
                System.out.println("weekday");
                break;

            default:
                System.out.println("Invalid day");
        }

    }
}
