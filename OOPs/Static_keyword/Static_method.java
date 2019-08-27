import java.util.Scanner;

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
