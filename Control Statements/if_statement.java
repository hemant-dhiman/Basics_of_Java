import java.util.Scanner;

public class if_statement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int a = obj.nextInt();
        ifstmt(a);
    }

    static void ifstmt(int age) {
        if (age >= 18) {
            System.out.println("Age is greater than or equal to " + age);
        }
    }
}
