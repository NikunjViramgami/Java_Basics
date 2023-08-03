import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are eligable in licence");
                break;
            case 30:
                System.out.println("You are above 30");
                break;
            case 50:
                System.out.println("You arre above 50");
                break;
        
            default:
                System.out.println("You are enjoy life");
                break;
        }
    }
}
