class Base{
    Base(){
        System.out.println("I am Constuctor of base class");
    }
    Base(int a){
        System.out.println("I am a Contctor of base claass with argument a"+a);
    }
}
class Derived extends Base{
    Derived(){
        // whenver uhh can call as a argument valo constructor then use super keywords;
        // super(9);
        System.out.println("I am constuctor of Derived class");
    }
    Derived(int a,int b){
        super(a);
        System.out.println("I am constructor of Drived class with argument of b"+b);
    }
}

class childDerived extends Derived{
   childDerived(){
    System.out.println("You are childderived class constructor");
   } 

   childDerived(int a,int b, int c){
    super(a, b);
        System.out.println("You are childderived class with argument of c"+ c);
   }
}
public class constructor_in_Inheritence {
    public static void main(String[] args) {
        // Base b = new Base(5);
        // whenever uh can call as derived class first call base class constructor
        // Derived d = new Derived(10,89);
        childDerived cd = new childDerived(89, 49, 39);
    }
    

}
