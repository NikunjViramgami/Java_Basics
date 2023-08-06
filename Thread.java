

// class MyThread extends Thread{
    
//     public void run(){
//         while(true){
//             System.out.println("Thread 1 Running");
//             System.out.println("I am happy");
//         }
     
//     }
// class MyThread1 extends Thread{
//     public void run(){
//         int i = 0;
//         while(i<1000){
//         System.out.println("Thread 2 Running");
//         System.out.println("Fiunally");
//         i++;
//     }

//     }

// }
// }
class Shape{
    int length;
    int breadth;
    public Shape(int length,int breadth){
        this.breadth= breadth;
        this.length= length;
    }
    public void run(){
        System.out.println(length);
        System.out.println(breadth);
    }
}

class Rectangle extends Shape{
    
    public Rectangle(int l,int b){
        super(l, b);
        
    }
    @Override
    public void run(){
        System.out.println(length*breadth);
    }
}

public class Thread {
    public static void main(String[] args) {
        // MyThread mt = new MyThread();
        // MyThread1 mt1 = new MyThread1();
        // mt.run();
        Shape obj = new Shape(4, 5);
        obj.run();
        Rectangle rc = new Rectangle(4, 5);
        rc.run();
    }
}



// 