class Employee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    // Create Constrcutor
    
    public Employee(){
        // int id= 6;
        String name = "AHrsh";
    }
    public Employee(String myname){
        name = myname; 
    }

}
public class AccessModifier {
    public static void main(String[] args) {
        Employee yash = new Employee("Pratik");
        // yash.id = 1;
        // yash.name = "Nikunj";
        // System.out.println(yash.id);
        // System.out.println(yash.name); This is throw error bcoz od access modifier The use of access modifier we can validattion apply
        // yash.setName("Varun");
        // System.out.println(yash.getName());

        // When we can create constructor same as class name 
        System.out.println(yash.getName());
        
    }
}
