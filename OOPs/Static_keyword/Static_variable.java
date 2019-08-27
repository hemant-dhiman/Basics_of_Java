class Static_var{
    int a;// non-static variable
    static int b; // static variable

    Static_var(){
        a++;
        b++;
        System.out.println("non-static variable: "+a); // non-static variable every time initialise with zero whern object created
        System.out.println("static variable: "+b); // static variable initialise only once
    }
}
public class Static_variable {
    public static void main(String[] args) {
        Static_var s1 = new Static_var();
        Static_var s2 = new Static_var();
        Static_var s3 = new Static_var();
    }
}
