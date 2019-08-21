public class vars {
    int a; // instance variable(no need to initialise)
    static int b; //java static variable(no need to initialise)
    public static void main(String[] args) {
        vars obj = new vars();
        obj.method();
    }
      void method(){
        int b = 12; // java local variable(need to initialise)
        System.out.println("local Variable b: "+b);
        System.out.println("static Variable b: "+vars.b);
        System.out.println("instance Variable b: "+a);
    }
}
