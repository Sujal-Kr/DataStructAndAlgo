package GeeksForGeeks;
import java.util.*;
public class FractionalKnapsack {
    
    static class Item{
        int value;
        int weight;
        Item(int values,int weight){
            this.value = values;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        int values[] = {60,100,120};
        int weight[] = {10,20,30};
        Item arr[]=new Item[values.length];
        int total=50;
        for(int i=0; i<values.length; i++){
            arr[i]=new Item(values[i],weight[i]);
        }
        double ans=solution(arr,total);
        System.out.println(ans);
    }

    private static double solution(Item[] arr,int total) {
        Arrays.sort(arr,new Comparator<>(){
            public int compare(Item a,Item b) {
                return Double.compare((double)b.value/b.weight, (double)a.value/a.weight);
            }
        });
        
        double ans=0;
        for(Item item:arr){
            if(item.weight<=total){
                ans+=item.value;
                total-=item.weight;
            }else{
                ans+=((double) item.value /item.weight)*total;
                break;
            }
        }
        return ans;
    }
}
