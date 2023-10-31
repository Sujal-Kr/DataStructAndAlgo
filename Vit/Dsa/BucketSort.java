package Vit.Dsa;
import java.util.*;
public class BucketSort {
    public static void main(String[] args) {
        double arr[]={0.23,0.31,0.35,0.5,0.78,0.1,0.01};
        solution(arr);
        for(double item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }

    private static void solution(double[] arr) {
        ArrayList<LinkedList<Double>> buckets=new ArrayList<>();
        System.out.println("Bucket Sort");
        System.out.println();
        for(int i=0;i<10;i++){
            buckets.add(new LinkedList<Double>());
        }
        for(int i=0;i<arr.length;i++){
            int index=(int)(arr[i]*10);
            System.out.println(index);
            buckets.get(index).add(arr[i]);
        }
        for(LinkedList<Double> bucket : buckets){
            Collections.sort(bucket);
        }
        System.out.println(buckets);
        int counter=0;
        for(LinkedList<Double> bucket : buckets){
            for(Double value : bucket){
                arr[counter++]=value;
            }
        }
    }
}
