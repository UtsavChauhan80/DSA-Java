import java.util.Scanner;
public class Third_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                third = second;
                second = max;
                max = arr[i];
            }
            else if (arr[i] > second && arr[i] != max) {
                third = second;
                second = arr[i];
            }
            else if (arr[i] > third && arr[i] != second && arr[i] != max) {
                third = arr[i];
            }
        }
        System.out.println("Third maximum = " + third);
    }
}