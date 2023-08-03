// Abstract class is used to as a standard of child class
abstract class A{
    public A(){
        System.out.println("This is a Class A");
    }
    abstract public void meth1();
    abstract public void meth2();
}
class B extends A{
    public void meth1(){
        System.out.println("Hello good Mornig");
    }
    public void meth2(){
        System.out.println("Greeting to meet uhh");
    }
}
abstract class c extends A{
    public void meth3(){
        System.out.println("its derived class C");
    }
}
public class abstract_class {
    public static void main(String[] args) {
        // A obj = new A(); Can not create a object of abstract class
        B obj1 = new B();
        obj1.meth1();
        // c obj3 = new C(); same as 
    }
}
