public class Associativity {
    public static void main(String[] args) {
        int a = 5*4-50/5;
        // Highest presidense to * and / thts why 
        // 20-50/5
        // 20-10
        // 10
        System.out.println(a);
        int b = 60/5-8*9;
        // left to right concept 
        // 12-72
        // 60
        System.out.println(b);

        int d=59;
        System.out.println(d++);
        System.out.println(d);
        System.out.println(++d);
        System.out.println(d);
        char ch = 'a';
        System.out.println(++ch);
    }
}
