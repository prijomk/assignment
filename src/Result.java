import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many subjects you want ");
        int no_of_subjects= sc.nextInt();
        double sum = 0;
        if (no_of_subjects > 0){
            for (int i = 1; i <=no_of_subjects ; i++) {
                System.out.println("Enter your subject's marks "+i);
                sum+= sc.nextDouble();
            }
            if (sum<0){
                System.out.println("INVALID Marks");
            }
            double percentage=((sum/(no_of_subjects*100.00))*100.00);
            if (percentage >= 80) {
                System.out.println("Congratualtions you got A+ and got " + percentage);
            } else if (percentage < 80 & percentage >= 50) {
                System.out.println("Congratualtions you got B+ and got " + percentage);
            } else if (percentage < 50 & percentage >= 40) {
                System.out.println("Congratualtions you got C+ and got " + percentage);
            } else {
                System.out.println("You failed. Your percentage is " + percentage);
            }
        }
        else{
            System.out.println("Invalid ");
        }

    }
}