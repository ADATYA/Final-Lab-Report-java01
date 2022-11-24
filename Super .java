//class 01..
//super class
public class Super {
    int speed=100;
}
//class 02...
//sub class.
class bike extends Super{
    int speed=500;
    void display(){                                  //create constructor.
       // System.out.println(super.speed); //100          //super keyword create.
        System.out.println(speed);  //500
    }

    public static void main(String[] args) {
        bike b1=new bike();
        b1.display();
    }
}
// If we cannot use super class then print sub class 500;