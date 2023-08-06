import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File_handling {
    public static void main(String[] args) {
        // File myfile = new File("nikunj.txt");
        // try{
        //     myfile.createNewFile();
        // }
        // catch(Exception e){
        //     System.out.println("File is not created");
        //     e.printStackTrace();
        // }
        // writne in creating file
        // try {
        //     FileWriter fileWriter = new FileWriter("nikunj.txt");
        //     fileWriter.write("This is My New File of java");
        //     fileWriter.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }

        // Reading a file

        // File myfile = new File("nikunj.txt");
        // try {
        //     Scanner sc = new Scanner(myfile);
        //     while(sc.hasNextLine()){
        //         String line = sc.nextLine();
        //         System.out.println(line);
        //     }
        // sc.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     e.printStackTrace();
        // }

        // Delete a file
        File myfile = new File("nikunj.txt");
        if(myfile.delete()){
            System.out.println("Successfully deleted"+myfile.getName());
        }
        else{
            System.out.println("Some Errors occur during deleting a file");
        }
        

    }
}
