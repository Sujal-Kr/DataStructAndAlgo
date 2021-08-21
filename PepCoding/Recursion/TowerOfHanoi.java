package PepCoding.Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    private static void hanoi(int n, char src, char des, char aux) {
        if(n==0)return;
        hanoi(n-1,src,aux,des);
        System.out.println("move disk "+n+" from "+src+" to "+des);
        hanoi(n-1,aux,des,src);
    }
}
