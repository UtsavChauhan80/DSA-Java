import java.util.Scanner;
public class Smallest_Even_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Smallest even multiple = " + n);
        else
            System.out.println("Smallest even multiple = " + (n * 2));
    }
}
//logic the n and 2 both are multiple of that number
