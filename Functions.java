import java.util.*;

public class Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(diffsumAndmultiply(num1, num2));
        
        
        
    }

    static int sum(int num1,int num2){
        return num1+num2;
    }

    static int multiply(int num1,int num2){
        return num1*num2;
    }
    static int diffsumAndmultiply(int num1,int num2){
        return sum(num1,num2)-multiply(num1, num2);
    }
    
}
