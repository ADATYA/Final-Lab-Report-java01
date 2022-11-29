import java.util.*;
public class Math {
    public  static int Math(int a){
        if(a==1)
            return 0;
            else if(a==2)
                return 1;
            else
                return  Math(a-1)+Math(a-2);


    }

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.print("Type a Math term is:");
        int a= input.nextInt();
        int b=Math(a);
        System.out.println("The Math is :: "+b);
    }

}