public class Car extends Vehicle{     //abstract means extend class to access super class
    @Override
    public void run() {    //function method is create.
        System.out.println("Cer is moving fast and furies !!");
    }

    public static void main(String[] args) {
        Car c=new Car();             //object is created.
        c.run();         //call object to print.
    }
}
