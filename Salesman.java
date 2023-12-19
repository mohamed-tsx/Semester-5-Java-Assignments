import java.util.Scanner;

public class Salesman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Soo geli inta item aa iibisay: ");
        int items_sold = input.nextInt();
        int basePayment;

        if (items_sold > 5){
            basePayment = items_sold * 100;
        }
        else {
            basePayment = items_sold * 50;
        }
        System.out.println("Soo geli inta sanno aad shaqeysay: ");
        int years_worked = input.nextInt();
        if (years_worked >= 10) {
            basePayment += 100;
        }

        System.out.println("Your base payment is: "+basePayment);

    }
}
