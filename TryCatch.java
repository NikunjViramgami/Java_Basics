public class TryCatch {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The naswer is "+c);
        }
        catch(Exception e){
            System.out.println("We are not divide the number. Reason");
            System.out.println(e);
        }
        System.out.println("End the Program");
    }
}
