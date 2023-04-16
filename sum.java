import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st number");
        int A = in.nextInt();
        System.out.println("enter 2nd number");
        int B = in.nextInt();
        int sum = A + B;
        System.out.println(sum);
    }
}