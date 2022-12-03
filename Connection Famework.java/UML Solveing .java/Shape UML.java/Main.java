public class Test {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.lenth=4.5F;
        r1.width=5.0F;
        r1.color="Red";
        System.out.println("Area of Rectangle : " +r1.getArea());
        System.out.println("The color is " +r1.toString());
    }
}
