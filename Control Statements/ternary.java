import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String output = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(output);
        System.out.println("----------Switch----------");
        switch(number){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println(number + " between 1 to 5");
                break;
            case 6: case 7: case 8:
                System.out.println(number+" between 6 to 8");
                break;
            default:
                System.out.println("Invalid number!");
                break;
        }
    }
}
