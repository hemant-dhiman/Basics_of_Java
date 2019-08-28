class Validity1 extends RuntimeException{//Uncheched  Exception
    public Validity1(String str){
        super(str);
    }
}
public class custom_exception_unchecked{
    static void validateTheDate(int age) throws Validity1{
        if(age < 18){
            throw new Validity1("Not a Valid Age: "+ age);
        }else{
            System.out.println("WellCome!");
        }
    }
    public static void main(String[] args){
        try{
            validateTheDate(17);
        }catch(Validity1 e){
            System.out.println(e.toString());
        }
    }
}
