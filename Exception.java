
//18 num solve

public class Exception {
    public static void main(String[] args) {
        try{
            throw  new myException(2);
            //throw is used to create a new exception throw it
        }
        catch (myException e){
            System.out.println(e);
        }
    }
}
class myException extends java.lang.Exception{
    int a;
    myException(int b){
        a=b;
    }
    public String toString(){
        return ("Exception Number = " +a);
    }
}