class Student{
    int roll_no;
    String name;
}

public class initialize_object_with_reference {
    //initialize Student class data with its reference
    public static void main(String[] args) {
        Student Shrey = new Student(); //creating a instance of Student class as Shrey
        Student Vani = new Student(); //creating a instance of Student class as Vani

        Shrey.name = "Shrey Saxena"; //accessing variable 'name' with reference to Shrey
        Shrey.roll_no = 8; //accessing variable 'roll_no' with reference to Shrey

        Vani.name = "Vani Singhal"; //same with object Vani accessing its variable 'name'
        Vani.roll_no = 9;

        System.out.println("Shrey Data: "+Shrey.name+" "+Shrey.roll_no);
        System.out.println("Vani Data: "+Vani.name+" "+Vani.roll_no);
    }
}
