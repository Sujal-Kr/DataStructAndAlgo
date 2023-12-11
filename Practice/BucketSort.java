package Practice;
import java.util.*;
public class BucketSort {
    public static void main(String[] args) {
        double arr[]={0.45,0.56,0.55,0.12,0.11};
        solution(arr);
        for (double item : arr) {
            System.out.print(item+" ");
        }
    }

    private static void solution(double[] arr) {
        ArrayList<LinkedList<Double>>list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new LinkedList<Double>());
        }
        for(double item:arr){
            list.get((int)item*10).add(item);
        }
        for(LinkedList<Double> item:list){
            Collections.sort(item);
        }
        int p=0;
        for(LinkedList<Double> item:list){
            for(double ele:item){
                arr[p++]=ele;
            }
        }
    }
}
