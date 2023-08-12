public class Sorting{
    public static void main(String[] args) {
        int arr[]={3,6,2,72,9};
        sort(arr);
        for(int item:arr){
            System.out.println(item);
        }
    }
    public static void sort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("after sort");
        
    }
}
    
