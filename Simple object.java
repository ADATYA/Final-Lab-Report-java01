//class 01.
public class Book {
    protected  void  mes(){
        System.out.println("HELLO JAVA");
    }
}
//class02.
class paper extends Book{
    public static void main(String[] args) {
        paper obj=new paper();
        obj.mes();
    }
}