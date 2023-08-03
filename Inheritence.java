class Base{
        int x;
        public int getX(){
            return x;
        }
        public void setX(int x){
            System.out.println("I am setting x now");
            this.x = x;
        }
        public void printMe(){
            System.out.println("I am a constructor");
        }
    }
    class Derived extends Base{
        int y;
        public int getY(){
            return y;
        }
        public void setY(int y){
            System.out.println("I am seeting of Y");
            this.y = y;
        }
    }
public class Inheritence {
    public static void main(String[] args) {
        // creating object of base class
        Base b = new Base();
        b.setX(50);
        System.out.println(b.getX());

        // creating object of Derived class
        Derived d = new Derived();
        d.setX(90);
        System.out.println(d.getX());
    }
}
