import java.util.Scanner;

public class largest_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 > num2) {
            System.out.println("Number 1 is greater than Number 2");
        } else if (num1 == num2) {
            System.out.println("Both are Equal Numbers");
        } else {
            System.out.println("Number 2 is greater than Number 1");
        }
    }
}
