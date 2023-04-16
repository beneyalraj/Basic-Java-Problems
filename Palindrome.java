import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = in.nextLine();
        String reverse = "";
        int Len = str.length();
        for (int i = (Len - 1); i >= 0; --i) {
            reverse = reverse + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverse.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}

