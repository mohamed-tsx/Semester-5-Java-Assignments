import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            System.out.println("Soo geli number: ");
            ans.add(input.nextInt());
        }
        int left = 0;
        int right = ans.toArray().length - 1;

        int middle = (left + right) / 2;
        System.out.println(ans.toArray()[middle]);
    }
}
