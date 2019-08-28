class Validity extends RuntimeException{//Uncheched  Exception
    public Validity(String str){
        super(str);
    }
}
public class custom_exception_checked{
    static void validateTheDate(int age) throws Validity{
        if(age < 18){
            throw new Validity("Not a Valid Age--: "+ age);
        }else{
            System.out.println("WellCome--!");
        }
    }
    public static void main(String[] args){
        try{
            validateTheDate(17);
        }catch(Validity e){
            System.out.println(e.toString());
        }
    }
}
