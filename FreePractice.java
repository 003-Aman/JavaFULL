import java.util.*;

public class FreePractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hello World ");
        System.out.println("Aman Shrestha");
        System.out.println("*\n**\n***\n****\n*****");


        int side1=25;
        int side2=25;
        int area = side1*side2;
        System.out.println(area);
        String name ="Aman";
        String surname ="Shrestha";
        String fullname = name +" "+surname;
        System.out.println(fullname);
        int num1 = 10*5/10-5;  //moves from left to right in java
        int num2 = (10*5)/(10-5); 
        System.out.println(num1);
        System.out.println(num2);

        int count =0;
        String sentence="";
        while (count<6){
            System.out.println("Enter a word: ");
            System.out.println("Please give a space after every word!");
            
            String word = input.nextLine();
            count++;
            sentence +=word;

        }
        System.out.println(sentence);

        
        int a = input.nextInt();
        int b = input.nextInt();
        if(a==b){
            System.out.println("both are equal");}
        else{
            if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("b is greater");
            }
        }

        String Name = input.nextLine();
        switch(Name){
            case "Aman":System.out.println("hero");
            break;
            case "Piyush":System.out.println("kheladi");
            break;
            case "Pramod":System.out.println("Zero");
            break;
            default:System.out.println("Ko ho tw?");
        }

        System.out.println("ROWS: ");
        int row = input.nextInt();
        System.out.println("COLUMN: ");
        int col = input.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*");}//notice how we print only here not println
            System.out.println();}

    }
    
}
