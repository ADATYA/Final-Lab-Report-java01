
//Method overriding for encapsulation

public class Vaicle {
    void move(){   //Method calling
        System.out.println("Vaicle run so fast");
    }
}
//class 02 create
class Bike extends Vaicle {
    void move() {            //Method calling 2nd tine
        System.out.println("Bike is 150 cc and running everywhere");
    }

}
//class 03 ...
    class Car extends  Vaicle{
    void move(){
        System.out.println("AUDI IS 3000 CC so it move fast more then bike");
    }
    public static void main(String[] args) {
        Car c1=new Car();  // This constructor its call one time only
        c1.move();

    }
}
