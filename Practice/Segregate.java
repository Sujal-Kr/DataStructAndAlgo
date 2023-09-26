package Practice;


public class Segregate {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,0,1,1,1,0,0,0,0,1};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }int f=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                f++;
                arr[i]=0;
            }
        }
        for(int i=arr.length-1; i>=arr.length-f;i--){
            arr[i]=1;
        }
        System.out.println("Frewquency="+f);
        System.out.println("new modified array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
 
}   

