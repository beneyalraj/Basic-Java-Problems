import java.util.Scanner;

public class greeting_message {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = in.nextLine();
        System.out.println("Hey "+ name);
    }
}
