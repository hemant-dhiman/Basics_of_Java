public class Break_Continue {
    public static void main(String[] args) {
        System.out.println("break in normal loop");
        //break
        for (int i = 0; i <= 100; i++) {
            if (i == 5)
                break;//break terminate the execution whenever break statement occur
            System.out.print(i + " ");
        }
        System.out.println("\nbreak in labeled loops");
        aa:
        for (int j = 0; j <= 5; j++) {
            for (int k = 0; k <= 5; k++) {
                if(j == 2){
                    System.out.println("break when j = 2 and rest of the iteration get stop!");
                    break aa;
                }
                System.out.println(j+" "+k);
            }
        }

        System.out.println("Continue in normal loop!");
        for(int h = 0 ; h<=5 ; h++){
            if (h == 3){
                System.out.println("skipped");
                continue;//whenever continue occur it skip the lines which is written after continue
            }
            System.out.println(h);
        }
        System.out.println("continue in labeled loop");
        aa:
        for(int i = 0; i<=5 ; i++){
            for (int j = 0; j<=1;j++){
                if(i == 3){
                    System.out.println("skipped");
                    continue aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
