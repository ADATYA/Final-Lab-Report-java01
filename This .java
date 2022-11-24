public class This {
    int num;
    String name;
    This(String name,int num){
        this.name=name;            //using this operator.
        this.num=num;
    }
    void display(){
        System.out.println("My name is "+ name + " My number is" + num);
    }
}
class test{
    public static void main(String[] args) {
        This t1=new This("bikrom",213);
        t1.display();
    }

}
