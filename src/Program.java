import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, sum;

        System.out.print("Enter the value of X: ");
        x = sc.nextInt();

        System.out.print("Enter the value of Y: ");
        y = sc.nextInt();

        sum = x + y;

        System.out.printf("SUM = %d\n", sum);

        sc.close();
    }
}