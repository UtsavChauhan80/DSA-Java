import java.util.Scanner;
public class Reduce_Num_to_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int num = sc.nextInt();
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            step++;
        }
        System.out.println(step);
    }
}
