import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal,time and rate");
        double principal = in.nextDouble();
        int time = in.nextInt();
        int rate = in.nextInt();
        double SI = principal*(1+ rate*time);
        System.out.println("simple interest: "+SI);
    }
}
