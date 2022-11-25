public class overloding {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int s){
        return a+b-s;
    }
    double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        overloding o1=new overloding();  //constructor create
        o1.add(23,27);          //object create
        o1.add(12.12,23.23);
        System.out.println(o1.add(23,27));
        System.out.println(o1.add(12.12,23.23));
    }
}
