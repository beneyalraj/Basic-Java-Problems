import java.util.Scanner;

public class INR_into_USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the INR value");
        int INR = in.nextInt();
        float USD = (float) (INR/81.84);
        System.out.printf("USD value of "+INR+" is "+"%.2f",USD);

    }
}
