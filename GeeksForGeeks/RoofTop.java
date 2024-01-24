package GeeksForGeeks;
public class RoofTop{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int ans =solution(arr);
        System.out.println(ans);
    }

    private static int solution(int[] arr) {
        int max=-1;
        int steps=0;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]<arr[i+1])steps++;
            else steps=0;
            max=Math.max(max,steps);
        }
        max=Math.max(max,steps);
        return max;
    }
}