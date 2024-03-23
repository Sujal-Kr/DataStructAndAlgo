package Vit.CompetativeProgramming;

public class HourGlassSum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {4,5,6,7},
                {8,9,10,11},
            {12,13,14,15}};
        System.out.println(solution(arr));
    }

    private static int solution(int[][] arr) {
        int ans=0;
        int row=arr.length;
        int col=arr[0].length;
        for(int i=1; i<row-2; i++) {
            int sum=0;
            for(int j=1; j<col-2; j++) {
                sum+=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
