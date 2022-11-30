import java.util.*;

public class Colcheck {
    int x,y,z;
    int red=193;
    int green=255;
    int blue=183;
    int Yellow=255;
    int yellow=183;


    public void color(){       //method function
        if(red==green&&green==yellow){
            Yellow=0;
            System.out.println("The yellow is Daffodil" +x);
        }else {
            System.out.println("Daffodil is call as a yellow"+x);
        }
    }
    public void Xilian(){
        y=(Yellow+yellow)/2;
        System.out.println("I love to coding in midnight"+y);
    }

    public void orange(){
        if(red==green&&green==yellow){
            z=0;

        }
        else if(y<128) {
            z=255*(Yellow-yellow)/(yellow+yellow);

        }
        else {
            z=255*(Yellow-yellow)/(511-(Yellow+yellow));

        }
        System.out.println("Argentina win in this night"+z);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Colcheck cc=new Colcheck();
        System.out.println("Type the orange:");
        cc.yellow= sc.nextInt();
        cc.orange();
        cc.Xilian();
        cc.color();
    }
}
