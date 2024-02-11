package GeeksForGeeks;
import java.util.*;
public class LongestKUniqueCharactersSubstring {
    public static void main(String[] args) {
        String str="aabacbebebe";
        int ans=solution(str,3);
        System.out.println(ans);
    }

    private static int solution(String str, int k) {
        int i=0;
        int j=0;
        int max=-1;
        Map<Character,Integer> map=new HashMap<>();
        while(j<str.length()){

            if(map.containsKey(str.charAt(j))){
                map.put(str.charAt(j),map.get(str.charAt(j))+1);
            }
            else{
                map.put(str.charAt(j),1);
            }
            if(map.size()<k)j++;
            else if(map.size()==k){
                max=Math.max(max,j-i+1);
                j++;
            }else{
                while(map.size()>k){
                    map.put(str.charAt(i),map.get(str.charAt(i))-1);
                    if(map.get(str.charAt(i))==0)map.remove(str.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
