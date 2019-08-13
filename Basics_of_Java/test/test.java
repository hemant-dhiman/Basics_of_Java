import java.util.Scanner;

public class test{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter Name: ");
        String name = scan.nextLine();
        System.out.println("Nice To Meet You Mr. "+name);
        scan.close();
    }
}