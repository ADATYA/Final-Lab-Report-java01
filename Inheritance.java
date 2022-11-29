public class Box {
    int length;
    int hight;
    int width;
    public Box(int length,int hight,int width ) {
        this.length = length;
        this.hight = hight;
        this.width = width;
    }

    public void music() {
        System.out.println("Box music:" + (length * width * hight));
    }

    public static void main(String[] args) {

    }
}
//// other class 
public class Boxsquere extends Box {
    public Boxsquere(int length, int hight, int width) {
        super(length, hight, width);

    }

    public void locatation() {
        System.out.println("Surface locatation : " + ((2 * length * width) + (2 * length * hight) + (2 * length * hight)));
    }

    public static void main(String[] args) {
        Boxsquere b1 = new Boxsquere(2, 3, 5);
        b1.locatation();
        b1.music();
    }
}

