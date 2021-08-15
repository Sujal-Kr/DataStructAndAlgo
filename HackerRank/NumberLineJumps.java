package HackerRank;

public class NumberLineJumps {
    public static void main(String[] args) {
        int x1=2; 
        int y1=1;
        int x2=1;
        int y2=2;
        System.out.println(jump(x1,x2,y1,y2));

    }

    private static boolean jump(int x1, int x2,int y1,int y2) {
        while(x1+y1<=x2+y2){
            if(x1==x2)return true;
            x1+=y1;
            x2+=y2;
        }
        return false;
    }
}
