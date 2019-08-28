public class unchecked_propation {
    void a(){
        System.out.println(3/0); // ArithmeticException is an checked Exception
    }
    void b(){
        a();
    }
    void c(){
        try{
            b();
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        unchecked_propation obj = new unchecked_propation();
        obj.c();
        System.out.println("normal flow!");
    }
}
