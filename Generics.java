import java.util.*;
public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList();
        arraylist.add(9);
        arraylist.add(8);

        // Type casting
        // int a = (int) arraylist.get(1);
        // System.out.println(a);

        int a = arraylist.get(0);
        System.out.println(a);

    }
}
