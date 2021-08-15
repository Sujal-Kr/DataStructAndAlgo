package HackerRank;
import java.util.*;
public class JumpiingOnTheClouds {
    public static void main(String[] args) {
        int[] x={0,0,1,0,0,1,0};
        List<Integer> clouds=new ArrayList<Integer>();
        for(int i=0; i<x.length; i++){
            clouds.add(x[i]);
        }
        System.out.println(solution(clouds));
    }

    public static int  solution(List<Integer> clouds) {
        int step=0;
        int i=0;
        while(i<clouds.size()-1){
            if(i+2==clouds.size()||clouds.get(i+2)==1){
                i++;
                step++;
            }
            else{
                i+=2;
                step++; 
            }
        }
        return step;
    }
}
