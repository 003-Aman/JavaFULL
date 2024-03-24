import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("What is the size of the array: ");
        // int size = input.nextInt();
        // int marks[] = new int[size];
        

        // for(int i:marks){
        //     marks[i]=input.nextInt();
        // }


        // System.out.println("What is the target :");
        // int target = input.nextInt();


        // for(int i:marks){
        //     if(i==target){
        //         System.out.println("number found at index : "+ marks[i]);
        //         break;
        //     }
        //     else{
        //         System.out.println("Number does not exist");
        //     }
        // }
        // input.close();

        //2D ARRAYS
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] numbers = new int[rows][cols];

        //input
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]=input.nextInt();

            }
        }
        //output
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j] + " ");}
            System.out.println();
        
        }

         

    
}
}
