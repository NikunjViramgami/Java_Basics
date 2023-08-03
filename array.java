import java.util.Scanner;

public class array {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // !.Declaration and memory allocation 
        // int [] stu = new int[5];
        // 2.Declaration and then memory allocation
        // int [] marks;
        // marks[0] = 15;
        
        // stu[0] = 13;
        // stu[1] = 87;
        // stu[2] = 63;
        // stu[3] = 89;
        // stu[4] = 49;
        // System.out.println(stu);
        // 3. Declaration ,memory allocation and intialization
        // int [] num = {1,5,9,7,9};
        // System.out.println(num.length);

        // for (int i =0;i<=num.length-1;i++)
        // {
        //     System.out.println(num[i]);
        // }
        // for (int i=num.length-1;i>=0;i--){
        //     System.out.println(num[i]);
        // }
        // // foreach loop
        // for (int element: num){
        //     System.out.println(element);
        // }

// Make a 2d Array
        // int [][] flats = new int[2][3];
        // // 2 row 3 Column
        // flats[0][0] = 101;
        // flats[0][1] = 102;
        // flats[0][2] = 103;
        // flats[1][0] = 201;
        // flats[1][1] = 202;
        // flats[1][2] = 203;
        // System.out.println(flats[0][0]);

        // for (int i=0;i<flats.length;i++)
        // {
        //     for(int j=0;j<flats[i].length;j++)
        //     {
        //         System.out.println(flats[i][j]);
        //         System.out.println(" ");
        //     }
        //     System.out.println("");
        // }
        // Make a 3d Array
        // int [][][] sqare = new int[2][3][4];

        // float [] arr = {2.56f,4.10f,8.90f};
        // float sum =0;
        // for (float ele : arr)
        // {
        //     sum = sum + ele;
          
        // }
        // System.out.println("The Value of sum is " + sum);

        // problem 2

        // float [] arr1 = {2.56f,4.10f,8.90f};
        // boolean isInArray = false;
        // try(Scanner sc = new Scanner(System.in)){
        // System.out.println("Enter the Number");
        // // boolean b1 = sc.hasNextInt();
        // float n1 = sc.nextFloat();
        // // System.out.println(b1);

       
        // for (float num1: arr1)
        // {
        //     if (n1 == num1){
        //         isInArray = true;
        //         break;
        //     }
    
        //     }

        // if (isInArray){
        //     System.out.println("The value is present in the array");
        // }
        // else {
        //     System.out.println("The value is not present in array");
        // }
            
        // }

        int [][] array1 = {{1,2,3},
                           {6,9,0}};
        int [][] array2 = {{10,4,6},{11,5,66}};
        int [][] result = {{0,0,0},{0,0,0}};
        for (int i =0;i<array1.length;i++){
            for(int j =0;j<array1[i].length;j++){
                // System.out.println(array1[i][j]);
                // System.out.println(" ");
                result[i][j] = array1[i][j] + array2[i][j];
                System.out.println(result[i][j]+ " ");
                

            }
            System.out.println("");
        }
        
        }
    }




    
    

