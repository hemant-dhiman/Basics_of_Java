public class loops {
    public static void main(String[] args) {
        System.out.println("For loop");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ",");
        }
        System.out.println("nested For loop");
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.println("outer: " + i + "--> inner: " + j);
            }
        }
        System.out.println("For each loop");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int value : array) {
            System.out.println("value = " + value);
        }
        System.out.println("Labeled for loop");
        aa:
        //label
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + "," + j);
            }
        }
    }
}
