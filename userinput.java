import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number 1");
            boolean b1 = sc.hasNextInt();
            System.out.println(b1);
             
            int a = sc.nextInt();
             System.out.println("Enter Number 2");
             int b = sc.nextInt();
             int sum = a+b;
             System.out.println("The sum of these numbers are:");
             System.out.println(sum);

             String str = sc.nextLine();
            //  nextline called read full line to string if we use only next then only first word read
             System.out.println(str);
        }

         


    }
}
