import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight:- ");

        double weight = sc.nextDouble();
        System.out.print("Enter height:- ");// height should be in cm.

        double height = sc.nextDouble();
        height=height/100;
        double bmi = weight / (height * height);

        System.out.printf("%.2f", bmi);
        System.out.println(" ");

        if (bmi < 18.5) {
            System.out.println("Level: Underweight");
        } else if (bmi < 25) {
            System.out.println("Level: Normal");
        } else if (bmi < 30) {
            System.out.println("Level: Overweight");
        } else if (bmi < 35) {
            System.out.println("Level: Obese");
        } else {
            System.out.println("Level: Extreme Obese");
        }
    }
}
