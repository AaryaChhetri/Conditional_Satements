import java.util.Scanner;

public class Result_Generator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of english");
        double Marks_of_English = sc.nextDouble();
        System.out.println("enter marks of maths");
        double Marks_of_Maths = sc.nextDouble();
        System.out.println("enter marks of science");
        double Marks_of_Science = sc.nextDouble();

        double Obtained_marks = (Marks_of_English+Marks_of_Maths+Marks_of_Science);

        double Total_marks =  300;

        double Obtained_Percentage = (Obtained_marks/Total_marks) * 100;

        if(Obtained_Percentage >= 90 & Obtained_Percentage<=100){
            System.out.println("Obtained grade is A+");
        }
        else if (Obtained_Percentage>=80 & Obtained_Percentage<90) {
            System.out.println("Obtained grade is A");
        }
        else if (Obtained_Percentage>=70 & Obtained_Percentage<80) {
            System.out.println("Obtained grade is B+");
        }
        else if (Obtained_Percentage>=60 & Obtained_Percentage<70) {
            System.out.println("Obtained grade is B");
        }
        else if (Obtained_Percentage>=50 & Obtained_Percentage<60) {
            System.out.println("Obtained grade is C+");
        }
        else if (Obtained_Percentage>=40 & Obtained_Percentage<50) {
            System.out.println("Obtained grade is C");
        }
        else {
            System.out.println("Obtained grade is Trash");
        }
    }
}
