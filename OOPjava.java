class Pen{
    String color;
    String type; //ballpoint or gel pen

    public void write(){
        System.out.println("the pen is writing something which is a function of the pen");

    }
}


public class OOPjava{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "ballpoint";
        pen1.write();
    }

}