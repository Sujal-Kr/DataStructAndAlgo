package GeeksForGeeks;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
public class MergeOverlapingIntervals{
    public static void main(String[] args) {
        intervals[] x=new intervals[4];
        x[0]=new intervals(6,8);
        x[1]=new intervals(1,9);
        x[2]=new intervals(2,4);
        x[3]=new intervals(4,7);
        mergeintervals(x);
    }

    private static void mergeintervals(intervals[] x) {
        Arrays.sort(x, new Comparator<intervals>() {
            @Override
            public int compare(intervals o1, intervals o2) {
                return o1.start-o2.start;
            }
        });
        for(intervals item:x){
            System.out.println(item.start+" "+item.end);
        }
        System.out.println();
        Stack<intervals> st = new Stack<>();
        st.push(x[0]);
        for(int i = 1; i <x.length; i++) {
            if(st.peek().end>=x[i].start){
                int temp=st.peek().end; 
                x[i-1].end=Math.max(temp,x[i].end);
            }
            else st.push(x[i]);
        }
        while(!st.isEmpty()){
            intervals item=st.pop();
            System.out.println(item.start+" "+item.end);
        }
    }
}
class intervals{
    int start;
    int end;
    intervals(int start, int end){
        this.start = start;
        this.end = end;
    }
}