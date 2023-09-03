import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        System.out.println("MENU");
        System.out.println("SN"+" "+"ITEM"+" "+"PRICE");
        System.out.println("1"+" "+"School_Chowmein"+" "+"Rs 110");
        System.out.println("2"+" "+"Ghiraula"+" "+"Rs 11");
        System.out.println("3"+" "+"Vanta"+" "+"Rs 1");


        int School_Chowmein = 110;
        int Ghiraula= 11;
        int Vanta = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the assigned number of item you want to order");
        int item = sc.nextInt();
        System.out.println("Enter the quantity you want to order");
        int quantity = sc.nextInt();

        int Final_Price = 0;
        if(item == 1){
            Final_Price =  School_Chowmein * quantity;
        }
        if(item == 2){
            Final_Price =  Ghiraula * quantity;
        }
        if(item == 3){
            Final_Price =  Vanta * quantity;
        }
        double discount_amount = 0.1 * Final_Price;
        double discount_price = Final_Price - discount_amount;

        double vat_amount = 0.13 * Final_Price;
        double bill_amount = discount_price + vat_amount;

        System.out.println("BILL");
        System.out.println("Total Amount:"+" "+Final_Price);
        System.out.println("Discounted Amount:"+" "+discount_amount);
        System.out.println("Your final amount after vat: " + " " + bill_amount);

    }
}
