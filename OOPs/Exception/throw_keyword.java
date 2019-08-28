public class throw_keyword {
    static void validate(int age){
        if(age <18){
            throw new ArithmeticException("Not Eligible for Vote!");
        }else{
            System.out.println("wellcome to vote!");
        }
    }

    public static void main(String[] args) {
        validate(13);
        //validate(18);
    }
}
