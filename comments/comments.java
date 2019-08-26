public class comments {
    public static void main(String[] args) {
        int i = 1; // this is a i variable storing 1
        System.out.println(i);
        /*
        and this
        is a
        multiline
        comment

         */
        doc(); // go to definition of doc method to see documentation comment
    }

    static void doc() {
        /**
         * this is
         * a documentation
         * comment for
         * doc method
         * it will print the
         * "hello"
         * on console!
         */
        System.out.println("hello");
    }
}
