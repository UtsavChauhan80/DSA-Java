import java.util.Scanner;

public class Container_With_Most_Water {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int width = j - i;
                int h = Math.min(height[i], height[j]);

                int area = width * h;

                if (area > max) {
                    max = area;
                }
            }
        }

        System.out.println("Maximum water = " + max);
    }
}