import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            getTotal();
        }
    }

    public static int getTotal() {
        Random random = new Random();
        int chanceNumber = random.nextInt(20); // 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        int i = scanner.nextInt();
        System.out.print("Please Enter Second Number : ");
        int y = scanner.nextInt();
        int total = (i + y); // 5 + 6
        if (total > chanceNumber) {
            System.out.print(" Good Job !... ");
            System.out.println("   Chance Number is : " + chanceNumber + " and your Total is : " + total);
            System.exit(0);
        } else {
            System.out.println("Sorry you must try chance again. The Chose Number was  : " + chanceNumber + " and your Total is : " + total);
            getTotal();
        }
        return total;
    }
}
