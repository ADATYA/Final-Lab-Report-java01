import java.sql.SQLOutput;

public class Throws {      
    public static void main(String[] args) {
        int S=8,B=0;
        try{
            int A=S/B;
            if (A==0)
                throw new Exception("This is imposiable");
            System.out.println(A);

        }catch (Exception e){
            System.out.println("Print ERROR !!!  " +e);
        }

    }
}
