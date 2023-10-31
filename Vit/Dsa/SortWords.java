package Vit.Dsa;

public class SortWords {
    public static void main(String[] args) {
        String arr[]= {"shikhar","virat","smriti","ajinkya"};
        solution(arr);
        for(String item:arr){
            System.out.print(item+" ");
        }
    }

    private static void solution(String[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int min=i;
            for(int j=i+1; j<arr.length; j++) {
                int p=0;
                if(arr[min].charAt(0)>arr[j].charAt(0)) {
                    min=j;
                }
            }
            String temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
