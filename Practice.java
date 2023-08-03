class Circle{
    public int radius;
    Circle(int r){
        System.out.println("this is circle class radius");
        this.radius = r;
    }
    public double area(){
        double pi = 3.14;
        return pi*this.radius*this.radius;
    }
}
class cylinder1 extends Circle{

    public int height;
    cylinder1(int r, int h) {
        
        super(r);
        this.height = h;
        //TODO Auto-generated constructor stub
    }

    public double volume(){
        double pi = 3.14;
        return pi*this.radius*this.radius*this.height;
    }

}
public class Practice {
    public static void main(String[] args) {
        Circle cr = new Circle(6);
        cylinder1 c1 = new cylinder1(7, 8);
        
        
        
    }
}
