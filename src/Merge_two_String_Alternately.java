import java.util.Scanner;

public class Merge_two_String_Alternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        String ans = "";
        int i = 0;

        while (i < s1.length() || i < s2.length()) {

            if (i < s1.length()) {
                ans += s1.charAt(i);
            }

            if (i < s2.length()) {
                ans += s2.charAt(i);
            }

            i++;
        }

        System.out.println("Merged string: " + ans);
    }
}