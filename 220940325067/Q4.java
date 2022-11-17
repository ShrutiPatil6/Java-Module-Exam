class GrandParent{
    String grandFatherName;
    String grandMotherName;

    GrandParent(String gFn, String gMn){
        grandFatherName = gFn;
        grandMotherName = gMn;

        System.out.println("Grand Father Name: "+ grandFatherName);
        System.out.println("Grand Mother Name: "+ grandMotherName);
    }

}
class Parent extends GrandParent{
    String fatherName;
    String motherName;

    Parent(String Fn, String Mn, String gFn, String gMn){
        super(gFn, gMn);
        
        fatherName = Fn;
        motherName = Mn;

        System.out.println("Father Name: "+fatherName);
        System.out.println("Mother Name: "+motherName);
    }
}

class Child extends Parent{

    Child(String Fn, String Mn, String gFn, String gMn) {
        super(Fn, Mn, gFn, gMn); 
    }    
}

public class Q4 {
    public static void main(String[] args) {
        Child c = new Child("Dad", "Mom", "Grand Pa", "Grand Ma");
    }
}
