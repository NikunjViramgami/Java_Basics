interface Bicycle{
    // give a properties also 
    // and all methods are abstract also without body
    final int num=45;
    void breakUp(int decrement);
    void speedup(int increment);
}

interface Car {
    public int y = 7;
    void Drive();
    void Fourwheeler();
}

class Vehilce implements Bicycle,Car{
    int speed = 45;
    public void breakUp(int decrement){    
        System.out.println("Applying brake");
        speed = speed - decrement;
        System.out.println(speed);
    }
    public void speedup(int increment){
        System.out.println("Applying speed");
        speed = speed + increment;
        System.out.println(speed);
    }
    public void Drive(){
        System.out.println("Drive in Car");
    }
    public void Fourwheeler(){
        System.out.println("Its also for wheeler");
    }
}

public class Interface_Intro {
    public static void main(String[] args) {
        Vehilce vc = new Vehilce();
        vc.breakUp(1);
        vc.speedup(5);
        System.out.println(vc.num);
        // can not change interface properties
        // vc.num = 46;
        vc.Drive();
        vc.Fourwheeler();
        System.out.println(vc.y);
    }
}
