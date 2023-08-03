public class method {
    int logic(int a, int b){
        int c;
        if (a>b){
            c = (a+b)*5;
            System.out.println(c);
        }
        else{
             c = a+b;
             System.out.println(c);
        }
        return c;
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z;
        // z = logic(x, y);

        int x1 = 7;
        int y1 = 5;
        int z1;
        // z1 = logic(x1, y1);
        
        // creating object method calling its a use whenever we can not a create static method 
        method obj = new method();
        z = obj.logic(x, y);
        z1 = obj.logic(x1, y1);
        
    
    }
}
