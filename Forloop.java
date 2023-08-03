public class Forloop {
    public static void main(String[] args) {
        int n=10;
        // for(int i=0;i<=n;i++){
        //     System.out.println(2*i+1);

        // }
        // for (int i=5; i>0; i--){
        //     System.out.println(i);
        // }
        // for (int i=5; i!=0; i--){
        //     System.out.println(i);
        //     System.out.println("Java is Great");
        //     if (i==2){
        //         System.out.println("Ending the Loop");
        //         break;
        //     }
        // }
        for (int i=5; i!=0; i--){
       
            if (i==2){
                System.out.println("Ending the Loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        }

    }
}
