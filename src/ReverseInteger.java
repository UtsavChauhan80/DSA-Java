import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        int rev = 0;
        for (int i = x; i != 0; i = i / 10) {
            rev = rev * 10 + i % 10;
        }
        System.out.println("Reverse = " + rev);
    }
}