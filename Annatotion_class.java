@FunctionalInterface
interface First {
    public void meth1(int a);
    // public void meth2();

}

// class Second implements First {
//     public void meth1() {
//         System.out.println("Meethod 1");
//     }
// }

// class Demo implements First{
// public void meth1(){
// System.out.println("This is method 1");
// }
// public void meth2(){
// System.out.println("This is method 2");
// }
// }
public class Annatotion_class {
    public static void main(String[] args) {
        // Demo d = new Demo();
        // d.meth1();
        // Annonimous class - Whenever uhh can use your class object only one time then
        // used anonymous class
        // First f = new First() {
        // public void meth1(){
        // System.out.println("This is meth 1");
        // }
        // public void meth2(){
        // System.out.println("This is meth2");
        // }
        // };
        // f.meth1();
        // First obj = new Second();
        // obj.meth1();
        
        // LMBADA FUNCTON NEW METHOD
        First f = (a)->{
            System.out.println("I am Meth 1"+a);
        };

        f.meth1(9);
    }
}
