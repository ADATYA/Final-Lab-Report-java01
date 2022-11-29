public class Interface implements A{
    @Override
    public void meth1() {
        System.out.println("Method 1 is create by java");
    }

    @Override
    public void meth2() {
        System.out.println("Method 2 is create by code ");
    }

    public static void main(String[] args) {
        Interface i=new Interface();
        i.meth1();
        i.meth2();
    }
}
