package PepCoding.SearchingAndSorting;
import java.util.*;
public class Pcm {
    static class Marks{
        int phy;
        int chem;
        int math;
        Marks(int phy, int chem, int math){
            this.phy = phy;
            this.chem = chem;
            this.math = math;
        }
    }
    public static void main(String[] args) {
        int phy[] = {4, 1, 10, 4, 4, 4, 1, 10, 1, 10};
        int chem[] = {5 ,2 ,9 ,6 ,3 ,10 ,2 ,9, 14, 10};
        int math[] = {12, 3, 6, 5, 2, 10, 16, 32, 10, 4};
        
        solution(phy, chem, math);
    }
    private static void solution(int[] phy, int[] chem, int[] math) {
        Marks marks[]=new Marks[phy.length];
        for(int i=0;i<marks.length;i++){
            marks[i] = new Marks(phy[i],chem[i],math[i]);
        }
        Arrays.sort(marks,new Comparator<>() {
            public int compare(Marks a,Marks b) {
                if(a.phy==b.phy){
                    if(a.chem==b.chem){
                        return a.math-b.math;
                    }else{
                        return b.chem-a.chem;
                    }
                }else{
                    return a.phy-b.phy;
                }
            }
        });
        for(int i=0;i<marks.length;i++){
            phy[i] =marks[i].phy;
            chem[i]=marks[i].chem;
            math[i]=marks[i].math;
        }
    }
}
