public class While {
    public static void main(String[] args) {
        int a =10;
        while(a<=20){
            System.out.println(a);
            if (a==15){
                System.out.println("Ending the loop");
                break;
            }
            a++;
        }
        System.out.println("Done...Successfully");

        // int b=50;
        // do{
        //     System.out.println(b);
        //     b++;
        // }
        // while(b<10);
    }
}
