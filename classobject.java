class Employee{
        int id;
        String name;
        int salary;
        String department;
        // creating a method
        // public void getDetails(){
        //     System.out.println("The id is" +" "+ id);
        //     System.out.println("The Name is"+" "+ name);
        //     System.out.println("Department is"+" "+department);
        // }
        public int getsalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name=n;
        }

    }
    class Square{
        int side;
        public int Area(){
            return side*side;
        }
        public int permimeter(){
            return 4*side;
        }
    }
    class Circle{
        int radius;
        double pi = 3.14;
        public double AreaofCircle(){
            return pi*radius*radius;
        }

    }
public class classobject {
    public static void main(String[] args) {
        System.out.println("Hello welcome");
        // Create a object of class
        Employee nikunj = new Employee();
        // define attributes
        // nikunj.id = 1;
        // nikunj.name = "Hello";
        // nikunj.department = "BDA";
        // nikunj.salary= 400000;
        // System.out.println(nikunj.id);
        // System.out.println(nikunj.name);
        // nikunj.getDetails();
        // salary store as a variable 
        // int salary = nikunj.getsalary();
        // System.out.println(salary);
        
        
        // nikunj.name = "Harshal Alolkar";
        // System.out.println(nikunj.getName());
        nikunj.setName("Harniss");
        System.out.println(nikunj.getName());

        // 2.
        Square sq = new Square();
        sq.side = 10;
        System.out.println(sq.Area());
        System.out.println(sq.permimeter());

        Circle sc = new Circle();
        sc.radius = 5;
        System.out.println(sc.AreaofCircle());
        


    }
}
