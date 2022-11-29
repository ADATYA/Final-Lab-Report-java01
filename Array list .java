import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("java");
        arr.add("Data Structure");
        arr.add("Engineering mathamatics");
        arr.add("Accounting");
        arr.add("Electronic Circuit");
        arr.add("Basic Electronic");
        System.out.println("Before Printing Subject are :");
        System.out.println(arr);
        Collections.sort(arr);  //using for java heading list .
        System.out.println("After printing Subject list are :");
        System.out.println(arr);
    }
}
