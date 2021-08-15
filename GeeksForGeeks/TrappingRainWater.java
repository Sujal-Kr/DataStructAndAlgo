package GeeksForGeeks;

public class TrappingRainWater {
    public static void main(String[] args) {
        int heigth[]= {6,9,9};
        int ans=maxarea(heigth);
        System.out.println(ans);
    }
    private static int maxarea(int[] x) {
        
        int maxarea=0;
        int[] right=new int[x.length];
        int[] left=new int[x.length];
        int max=0;
        for(int i=x.length-1; i>=0; i--){
            max=Math.max(x[i],max);
            right[i]=max;
        }
        max=0;
        for(int i=0;i<x.length; i++){
            max=Math.max(x[i],max);
            left[i]=max;
        }
        for(int i=0;i<x.length; i++){
            maxarea+=Math.min(right[i],left[i])-x[i];
        }
        return maxarea;
    }

   

}
