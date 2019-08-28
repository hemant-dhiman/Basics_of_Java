import java.io.IOException;

public class throws_keyword {
    void a() throws IOException{// for checked exception we use throws keyword
        throw new IOException(); // checked Exception
    }

    public static void main(String[] args) {
        checked_propagation obj = new checked_propagation();
        try{
            obj.a();
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("normal flow!");
    }
}
