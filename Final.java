
public class Final {
    public static int greet(){
        try{
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is call anyhow");
        }
        return 0;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
    }
}
