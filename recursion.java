public class recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial_second(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int num = 1;
            for(int i = 1;i<=n;i++){
                num *=i;

            }
            return num;
        }
    }
    public static void main(String[] args) {
        int x=6;
        System.out.println("The factorial of this number is" + " " + factorial(x));
        System.out.println("The factorial of this number is" + " " + factorial_second(x));
    }
}
