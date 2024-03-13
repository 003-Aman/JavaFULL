//public, private define the accessibility of class members, which play a crucial role in object interaction and encapsulation

class Cat{
    
     String color;
     String mood;


     void purr()//this is how we write a comment in java and this is a method purr like action
     {
        System.out.println("Cat purrs");
     }
}
//access modifiers like public and private and others are used to define the accessibility of class members which play a crucial role in object interaction and encapsulation.

public class Cat{

   private String color; //using private restricts access outside
   private String mood;

   public Cat(String color,String mood){//this is a constructor of java like __init__
      this.color = color;
      this.mood = mood;
   }


   public String getMood(){
      return mood;//if a function is returning a string then we need to put String infront of the function name and after the access type
   }//only when it returns not prints, we can use void 

   private void changeMood(String newMood){
      mood = newMood;
   }

   void purr()//this is how we write a comment in java and this is a method purr like action
     {
        System.out.println("Cat purrs");//void means that nothing is returned
     }

   public void makeHappy(){
      changeMood("Happy");//change mood function is called with paramenter Happy for newMood
      purr();
   }

}

public class Main{
   public static void main(String[] args) {
      Cat myCat =  Cat("Ginger","Angry");//remember this syntax
      //class name object name that you choose = new classname(with the parameters you chose , or empty brackets);
      

      System.out.println("the cat is "+myCat.getColor()+ "and feels" + myCat.getMood());
   
   
   
   }
//notes: here changeMood function cannot be accessed outside of the class because it has private accessor

}
public class Cat{
   String Color;// eta pani declare garnai parxa unlike python
   String Breed;
   int Age;

   public Cat(String Color,String Breed, int Age){// again here it is put inside parameters
      this.color = Color;
      this.breed = Breed;
      this.age = Age;
   }

   public String getName(){
      return this.color;
   }

   public void setName(String name){
      this.color = name;
      
   }
   public int getAge(){
      return this.age;
   }

   public void setAge(int age){
      this.age = age;
   }
}
//notes:public is accessible from everywhere
/*psvm wala main() is the method
 where the java program starts to execute from
 * i know this shit already but still, the name of the source file should precisely math the class name of the psvm method
 * 
 * 
 */