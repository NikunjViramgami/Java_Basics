
    class A{
        public int Num(int a){
            return a;
        }
        public void meth1(){
            System.out.println("This is a method of classs A");
        }
    }
    class B extends A{
        // This is a Method Overriding
        public int Num(int b){
            return b;
        }
        @Override
        public void meth1(){
            System.out.println("This is a method of classs B");
        }
    }
    public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.Num(7);
        a.meth1();
        B b = new B();
        b.Num(9);
        b.meth1();
    }
}
