package GeeksForGeeks;

public class StockBuyAndSell2 {
    public static void main(String[] args) {
        int arr[]={3, 4, 1, 5};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int bd=0;
        int sd=0;
        int profit=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>=arr[i-1]){
                sd++;
            }else{
                profit+=arr[sd]-arr[bd];
                bd=sd=i;
            }
        }
        profit+=arr[sd]-arr[bd];
        return profit;
    }
}
