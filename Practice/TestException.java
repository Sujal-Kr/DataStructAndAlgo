package Practice;
class CustomEx  extends Exception{
    CustomEx(String msg){
        super(msg);
    }
}
public class TestException {
    public static void main(String[] args) throws CustomEx{
        int a=56;
        int b=0;
        try{
            if(b==0)throw new CustomEx("i am done");
        }catch(CustomEx e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I must run!!!");
        }
    }
}
