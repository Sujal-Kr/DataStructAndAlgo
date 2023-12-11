package Practice;
import java.util.*;
public class ActivitySelection {
    static class pair{
        int start, end;
        pair(int start, int end){
            this.start = start;
            this.end = end;
        }

    }
    public static void main(String[] args) {
        int start[]={1, 3, 2, 5};
        int end[]={2, 4, 3, 6};
        int ans=solution(start, end);
        System.out.println(ans);

    }

    private static int solution(int[] start, int[] end) {
        ArrayList<pair> list = new ArrayList<pair>();
        for(int i=0;i<start.length;i++) {
            list.add(new pair(start[i], end[i]));
        }
        Collections.sort(list,(a,b)->a.end - b.end);
        int count=1;
        int curr=0;
        for (int i = 1; i < list.size(); i++) {
            if(list.get(curr).end<list.get(i).start){
                count++;
                curr=i;
            }           
        }
        return count;
    }
}
