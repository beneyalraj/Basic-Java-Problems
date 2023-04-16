import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Enter a operand");
        String operand = in.next();
        if (operand.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operand.equals("-")) {
            System.out.println(num1 - num2);
        } else {
            System.out.println("Enter a valid operand");
        }
    }
}
