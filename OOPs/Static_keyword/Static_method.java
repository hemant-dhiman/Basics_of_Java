import java.util.Scanner;

/*
Java static method
If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.
 */

class Teacher{
    static int id = 1180;

    static void print(){
        System.out.println("current id:"+id);
    }

    static void change(int num){
        id = num;
        System.out.println("Updated id: "+id);
    }
}

public class Static_method {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        Teacher.print(); // first printing id
        System.out.println("If Need to update press  y otherwise n: ");
        if(sc.nextLine().equalsIgnoreCase("y")){
            System.out.println("Enter new id: ");
            Teacher.change(sc.nextInt());
        }else{
            System.out.println("Thank you!");
        }

    }
}
