

public class OOPjava{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "ballpoint";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.type = "gel";
        pen2.typeOfpen();


        Student s1= new Student();
        s1.name = "Aman Shrestha";
        s1.age = 20;
        String display_info =s1.printInfo();
        System.out.println(display_info);

    
    }

}
class Pen{
    String color;
    String type; //ballpoint or gel pen

    public void write(){
        System.out.println("the pen is writing something which is a function of the pen");
        
    }
    public void printColor(){
        System.out.println("the color of the pen is"+ this.color);
        //this is similar to self.color of python

    }
    public void typeOfpen(){
        System.out.println(this.type);
        //color assign garena vane null return garxa
    }
}

class Student{
    String name;
    int age;

    public String printInfo(){
        return "the name of the student is"+this.name+"and the age of the student is"+this.age;
    }
}

