
//10 num solve
interface firstinterface {
    public void myMethod();

}
interface Secondinterface{
    public void  mysecondMethod();    //different method
}
class Demo implements firstinterface,Secondinterface{            //using implement keyword
    public void myMethod(){
        System.out.println("Create my Method ");   //1st method call
    }

    @Override                                //override [same name,same parameter]
    public void mysecondMethod() {
        System.out.println("Create my Second method ");        //2nd method call
    }
}
class MyMain{                                   //main class crete
    public static void main(String[] args) {
        Demo obj=new Demo();                    //constructor create
        obj.myMethod();
        obj.mysecondMethod();             //object call
    }


}