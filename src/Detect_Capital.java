import java.util.Scanner;
public class Detect_Capital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        int capital = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                capital++;
            }
        }
        if (capital == 0 || capital == word.length() ||
                (capital == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
//Logic
//-All Capital
//-All Small
//-First letter is Small