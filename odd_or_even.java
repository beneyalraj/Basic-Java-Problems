import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
