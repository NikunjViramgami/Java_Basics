import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Age:");
        // int age = sc.nextInt();
        // if (age>18){
        //     System.out.println("You can drive");
        // }
        // else{
        //     System.out.println("You can not drive");
        // }

        System.out.println("Enter num 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2:");
        int num2 = sc.nextInt();
        if (num1 == 5 && num2 == 9){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
