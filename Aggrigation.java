

class Address{
    String Inst="DIU";
     String Strim="CSE";

}
class Student{
    int id =213;
    String name="Bikrom";
    Address address=new Address(); //constructor create
//here  address are Aggrigation in Student class as has a relation.
}

public class Aggrigation {
    public static void main(String[] args) {
            Student s=new Student();
        System.out.println("Print Student name  :  "  +s.name);
        System.out.println("Print Student Id is :  "   +s.id);
        System.out.println("Print The Institute :  "  +s.address.Inst);   // this is cannot access cause of HAS a Relationship
        System.out.println("Print The Subject   :  "  +s.address.Strim);

    }
}
