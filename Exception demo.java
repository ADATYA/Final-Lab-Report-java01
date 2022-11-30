public class Throwsdemo {
    public static void main(String[] args)  { //[throws InterruptedException]here throws are working in bypass
        for(int i=1;i<10;i++){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
//to solve this in 1st way is using throw keyword.
//2nd way is using try catch.