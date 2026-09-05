import java.util.Scanner;
public class Cuberoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cu;
        System.out.print("Enter Number: ");
        int a =sc.nextInt();


        cu=a*a*a;
        System.out.println("The cube of "+a+" is = "+cu);
    }

}