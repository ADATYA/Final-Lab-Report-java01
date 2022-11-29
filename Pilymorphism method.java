public class Shape {
    public void draw(){
        System.out.println("I love to draw the shape");
    }
    public void erase(){
        System.out.println("I heat to erase drawing");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw the circle");
    }

    @Override
    public void erase() {
        System.out.println("Erase the circle");
    }
}
class Triangle extends  Shape{
    @Override
    public void draw() {
        System.out.println("Draw a triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erase the triangle");
    }
}
class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw a Squere");
    }

    @Override
    public void erase() {
        System.out.println("Erase a Squrer");
    }

}
class finish {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.draw();
        s.erase();
        Shape c=new Circle();
        c.draw();
        c.erase();
        Shape t=new Triangle();
        t.draw();
        t.erase();
        Shape sqer=new Square();
        sqer.draw();
        sqer.erase();
    }
}
