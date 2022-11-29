import java.util.*;
public class Math1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Type the size of array :");
            int s = sc.nextInt();
            int[] array=new int[s];
        }catch (NegativeArraySizeException b){
            System.out.println("The exception is :" +b);
        }finally {
            System.out.println("Processing is run out");
        }
    }
}
