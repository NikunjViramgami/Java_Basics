class phone {
    public void message(){
        System.out.println("This is a Phone Message");
    }
    // phone(){
    //     System.out.println("This is Phone");
    // }
    public void music(){
        System.out.println("This is a phone music");
    }
}
class smartPhone extends phone{
    public void Greet(){
        System.out.println("This is message for Smartphone");
    }
    // smartPhone(){
    //     System.out.println("This is a smart phone");
    // }
    public void music(){
        System.out.println("Play a smartphone music");
    }
}

public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        // this all are allowed to create object
        phone obj = new phone(); 
        smartPhone obj2 = new smartPhone();
        // called dynamic dispatch
        phone ph = new smartPhone();

        // obj.message();
        ph.music();
        

        // ph.Greet(); 
        // throw error bcoz uhh can not use smartphone class method only allow overriding method which belongs to class phone
        

        // This is not allowed to child class reference as a parent class 
        // smartPhone sm = new phone();
    }
}
