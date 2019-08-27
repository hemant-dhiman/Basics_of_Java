
public class ClassesConcept_2 {
    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        obj.method(); //Accessing another class method
    }
}

class AnotherClass{
    public void method(){
        System.out.println("accessing AnotherClass method");
    }
}
