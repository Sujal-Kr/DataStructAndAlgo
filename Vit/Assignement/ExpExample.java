package Vit.Assignement;

public class ExpExample {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try{
            for(int i=0; i<10; i++){
                arr[i]=1;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i am finally block.I will run every time");
        }
    }
}
