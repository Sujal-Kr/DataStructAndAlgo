package GeeksForGeeks;
import java.util.*;
public class FractionPairsWithSum1 {
    public static void main(String[] args) {
        int[] num={3, 1, 12, 81, 2};
        int[] dem={9, 10, 18, 90, 5};
        int ans=solution(num, dem);
        System.out.println(ans);
    }

    private static int solution(int[] num, int[] dem) {
        int count=0;
        Map<Double,Integer> map=new HashMap<>();
        System.out.println(1-(Double.valueOf(num[0])/Double.valueOf(dem[0])));
        for(int i=0; i<num.length; i++){
            
            if(map.containsKey(1-(Double.valueOf(num[i])/Double.valueOf(dem[i])))){
                count++;
            }
            else{
                map.put((Double.valueOf(num[i])/Double.valueOf(dem[i])),i);
            }
        }
        return count;
    }
}
