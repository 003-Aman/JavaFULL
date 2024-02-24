


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
        while(int i<=10){System.out.println(i);i++;}

        
    }
}