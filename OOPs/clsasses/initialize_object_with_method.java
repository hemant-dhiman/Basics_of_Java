class Students{
    int roll_no;
    String name;

    public void enterDetails(String n, int r){
        this.name = n; // this keyword use for current class instance
        this.roll_no = r;
    }

    public void pritnStudentsDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Roll_no: "+this.roll_no);
    }
}

public class initialize_object_with_method {
    public static void main(String[] args) {
        Students Arun = new Students();
        Students Priya = new Students();

        Arun.enterDetails("Arun", 5);
        Arun.pritnStudentsDetails();

        Priya.enterDetails("Priya",  6);
        Priya.pritnStudentsDetails();
    }
}
