import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int og_number = num;
        int rem = 0;
        int result = 0;

        while (og_number != 0) {
            rem = og_number % 10;
            result += Math.pow(rem, 3);
            og_number /= 10;

        }
        if (num == result) {
            System.out.println("It is a ArmStrong number");
        } else {
            System.out.println("Not an ArmStrong number");
        }
    }
}
