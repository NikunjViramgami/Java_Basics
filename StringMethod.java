public class StringMethod {
    public static void main(String[] args) {
        String str = "Nikunj";
        System.out.println(str);
        int num = str.length();
        System.out.println(num);
        String lstring = str.toLowerCase();
        System.out.println(lstring);
        String uString = str.toUpperCase();
        System.out.println(uString);
        String nontrimString = "      Harry";
        System.out.println(nontrimString);
        
        // Remove space 
        String newtrim = nontrimString.trim();
        System.out.println(newtrim);

        System.out.println(str.substring(3));
        System.out.println(str.substring(2, 6));

        System.out.println(str.replace('k', 'p'));
        System.out.println(str);

        System.out.println(str.startsWith("Nik"));
        System.out.println(str.endsWith("Nik"));

        System.out.println(str.charAt(3));

        System.out.println(str.indexOf("ku"));

        System.out.println(str.indexOf("k", 5));

        System.out.println(str.lastIndexOf("j"));

        System.out.println(str.lastIndexOf("ku", 1));
            
    }
}
