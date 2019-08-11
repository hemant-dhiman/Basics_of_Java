import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Hello World!\nPlease Enter your name: ");
        String _name = scan.nextLine();
        System.out.println("Nice to meet you "+_name);
        scan.close();
        
    }
}