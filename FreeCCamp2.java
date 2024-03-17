public class FreeCCamp2 {
    int number =100;
    byte age =20;
    short year =2024;//larger than byte but smaller than int
    long population = 123456789L;//for large number
    //also note that there is a capital L here at the last

    float price = 10.98F; //decimal you know it teipani 
    //lets go with the basics again for a better grasp
    // and there is a F here at the last

    double distance =89.9; //floating point numbers wiht a double precision

    boolean one = true;
    boolean two = false;  //python has capital T and F

    char initial = 'A';

    
}
class Demo{
    int a,b;

    //constructor
    Demo(int a, int b){
        this.a = a; // in java the this.variablename cannot be different from the parameter name unlike python
        this.b = b; //self.num2 =b could be done in python
    }

    int addition(){// we neither gave public nor private and ofc not void because it returns a value
        return a +b;
    }

    int subtraction(){//int because it returns an integer
        return a -b;
    }
}
//arrays
//we can create arrays in two ways 
int[] arr1 = {1,2,3,4,5};
String[] arr2 = {"aman","pramod","piyush","aditya"};

int array[]={1,2,3,4,5,6};
String array2[]={"am","bm","cm","dm"};//what i learned is i cannot string values in single quotation here ''

//Type casting: translating one datatype to another

int number =9;
double dnumber = number;//implicit (automatic)

double num =3.78;
int myint =(int)num;
System.out.print(myint);//explicit casting(manual)

//typecasting in OOP



