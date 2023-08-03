interface One{
    void meth1();
    void meth2();
}
interface Two extends One{
    void meth3();
    void meth4();
}
class Final implements Two{
    public void meth3(){
        System.out.println("Meth 3");
    }
    public void meth4(){
        System.out.println("Meth 4");
    }
    public void meth1(){
        System.out.println("Meth 1");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
} 
public class inheritance_in_interface {
    public static void main(String[] args) {
        Final obj = new Final();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
