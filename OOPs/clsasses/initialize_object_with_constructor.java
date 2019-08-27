class Student_2{
    /*
    Rules for creating Java constructor
      There are two rules defined for the constructor.
        Constructor name must be the same as its class name
        A Constructor must have no explicit return type
        A Java constructor cannot be abstract, static, final, and synchronized
     */
    int roll_no;
    String name;
    Student_2(){
        System.out.println("Default Constructor");
        System.out.println("roll_no: "+this.roll_no);
        System.out.println("name: "+this.name);
    }

    Student_2(int r, String n){
        /*Also a example of Constructor overloading*/
        this.roll_no = r;
        this.name = n;
        System.out.println("Parameterised Constructor");
        System.out.println("roll_no: "+this.roll_no);
        System.out.println("name: "+this.name);
    }
}

public class initialize_object_with_constructor {
    public static void main(String[] args) {
        Student_2 s1 = new Student_2(); // Default constructor
        Student_2 s2 = new Student_2(4,"Name"); // parameterised constructor
    }
}
