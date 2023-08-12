
import java.util.*;
public class LastSeen {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 10};
        Arrays.sort(array);
        int f;
        boolean[] visited = new boolean[array.length];
        for(int item : array){
            System.out.print(item +" ");
        }
        System.out.println();
        for(int i=0; i < array.length-1; i++){ 
            f=0;
            for(int j=0; j<array.length; j++){
                if(array[i]==array[j]&&(!visited[j])){
                    f++;
                    visited[j]=true;
                }
            }
            if(f==1){
                System.out.println(array[i]);
                break;
            }
               
        }
    }
    
}
