package GeeksForGeeks;
import java.util.*;
public class ElementThatAppearFirst {
    public static void main(String[] args) {
        int[] x={1,1,2,5,5};
        System.out.println(soution(x));
    }

    private static int soution(int[] x) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0; i<x.length;i++){
            if(!map.containsKey(x[i])){
                map.put(x[i],1);
            }
            else{
                map.put(x[i],map.get(x[i])+1);
            }
        }
        for(int item:x){
            if(map.get(item)==1)return item;
        }
        
        return 0;
    }
}
