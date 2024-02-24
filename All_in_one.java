


import java.util.Random;
import java.util.Scanner;
class All_in_one{
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Basic print
        System.out.println("Lets start this shit");
        //baisc inputs from user of different datatypes
        Scanner input = new Scanner(System.in);//necessary for input
        int number = input.nextInt();
        String sentence = input.nextLine();
        float decimal = input.nextFloat();
        //basic for and while loop
        int count = 0;
        for(int i=0; i<=10;i++){
            count += 10;
        }
        System.out.println(count);

        // while and do-while are very similar
        int i;
        while(i<=10){System.out.println(i);i++;}

        //methods of string class
        /*charAt
        compareTo
        concat
        equals
        equalsIgnoreCase
        length
        .replace(a,b)
        .substring(a,b)
        .toLowerCase  .lower() in python
        .toUpperCase   .upper() in python
         * 
         */

         //Learn about the java API's
         //import java.util.*; * means all

         Random random = new Random();
         int rand_int = random.nextInt();
         System.out.println(rand_int);

         /*Learn about the math class
          * like absolute value
          exponential
          power
          square
          */

          //formatting output
          //NumberFormat and DecimalFormat

        
    }
}