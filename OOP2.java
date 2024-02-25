//used constructors properly

public class OOP2 {
    public static void main(String[] args) {

        //d1 = Device("Iphone",2020)  in python
        Device d1 = new Device("Iphone",2020);
        d1.get_info();
        
    }
    
}

class Device{
    String model;
    int year;

    Device(String model, int year){
        this.model = model;
        this.year = year;
    }

    void get_info(){
        System.out.println("Model: "+this.model+", Year: "+this.year);
    }
}
