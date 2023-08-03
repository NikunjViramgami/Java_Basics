import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sub1 mark");
            int a = sc.nextInt();
        System.out.println("Enter sub2 Mark");
            int b = sc.nextInt();
        System.out.println("Enter sub3 Mark");
            int c = sc.nextInt();
        System.out.println("Enter sub4 Mark");
            int d = sc.nextInt();
        System.out.println("Enter sub5 Mark");
            int e = sc.nextInt();
        
        float percentage = (a+b+c+d+e)/5;
        System.out.println("Percentage is");
        System.out.println(percentage);

    }
}
