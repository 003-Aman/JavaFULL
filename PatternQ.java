import java.util.*;
public class PatternQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int m =10; 
    
    //print a rectangle using loops
    for(int i =1;i<=n;i++){
        for(int j =1;j<=m;j++){
            if(i==1||j==1||i==n||j==m){
                System.out.print("*");}
            else{
                System.out.print(" ");
            }

            }
        System.out.println();}

    //print a right angled triangle
    int a = 10;
    for (int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

        
    }
    // rotated right angled traingle
    int b = 10;
    for(int i=b;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();
    }
// in python "*"*6 can be done but in java we cannot
    //FUNCTIONS
    /* returnType functionName(type arg1,type arg2){
         operation
    }
     */
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    System.out.println(sum(num1,num2));
    }


    static int sum(int num1,int num2){
        return num1+num2;

    }
    }
    

    


