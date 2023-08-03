public class method2 {
    static void launch(){
        System.out.println("Hello Good morning");
    }
    static void launch2(int a){
        System.out.println("Hello "+ a + " bro ");
    }

    static void call(int a){
        a = 98;
    }

    static void call2(int [] arr){
        arr[0] = 56;
    }


    // Method Overloading
    static void foo(){
        System.out.println("Good mornin");
    }
    static void foo(int a){
        System.out.println("hello "+ a + "Brother");
    }
    static int foo(int a,int b){
        int c;
        c = a+b;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        launch();
        launch2(30);

        // value not change bcoz of data type only copy the value
        int x=45;
        call(x);
        System.out.println("The value of x after calling function:" + x);


        // value change when uhh have pass reference or object to class method
        int [] arr = {3,6,8,0,1};
        
        call2(arr);
        System.out.println("The value of arr after calling function:" + arr[0]);

        // Method Overloading
        foo();
        foo(6);
        int r;
        foo(7, 9);
        
    }
}
