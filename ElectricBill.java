import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Soo geli aqriska hore: ");
        int killowats = input.nextInt();
        System.out.println("Soo geli aqriska danbe: ");
        int killowatts1 = input.nextInt();

        int currentKillowatts = killowatts1 - killowats;

        double payment = 0;
        if (currentKillowatts > 300) {
            payment = currentKillowatts * 0.31;
        }
        else {
            payment = currentKillowatts * 0.41;
        }
        System.out.println("You need to pay: "+payment);
    }
}
