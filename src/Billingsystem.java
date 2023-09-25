import java.util.Scanner;

public class Billingsystem {
    public static void main(String[] args) {
        int no_of_items;
        int rate=0;
        int quantity=0;
        String name="";
        double gtotal=0;
        int total=0;
        System.out.println("What is the number of items you purchased? ");
        Scanner sc =new Scanner(System.in);
        no_of_items = sc.nextInt();
        for (int i = 1; i <= no_of_items ; i++) {
            System.out.println("What is your item's name :"+ i);
            name = sc.next();
            System.out.println("What is your item's rate "+ name);
            rate= sc.nextInt();
            System.out.println("Enter the quantity you bought");
            quantity= sc.nextInt();
            System.out.println("--------------------------------");
            total= rate*quantity;
            System.out.println("name- "+ name+" rate - "+rate +" quantity - "+quantity+ " total- "+total);
            gtotal+=rate*quantity;
        }
        gtotal=total-(total*0.1);
        gtotal=gtotal+(gtotal*0.13);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                +"Grand Total: "+gtotal);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPLEASE VISIT AGAIN");
    }
}