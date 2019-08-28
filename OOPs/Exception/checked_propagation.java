/**
 * it is not a program its just
 * example program that checked
 * exception not propagate at
 * the time of method calling!
 */

import java.io.IOException;

public class checked_propagation {
    void a() throws IOException{// for checked exception we use throws keyword
        throw new IOException(); // checked Exception
    }
    void b(){
        a();//error
    }
    void c(){
        try{
            b();
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        checked_propagation obj = new checked_propagation();
        obj.c();
        System.out.println("normal flow!");
    }
}
