import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am a toString()";
    }
    public String getMessage(){
        return "I am toMessage()";
    }
}
public class Exception_in_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<10){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
