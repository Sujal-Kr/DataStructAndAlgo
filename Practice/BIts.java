package Practice;

import java.util.*;
public class BIts {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any no.");
        int n=in.nextInt();
        ArrayList<Integer> bits=new ArrayList<>();
        while(n>0){
            bits.add(n%2);
            n=n/2;
        }
        //System.out.println(bits);
        // int index=bits.size()-1;
        // while(index>=0){
        //     System.out.print(bits.get(index)+" ");
        //     index--;
        // }
        System.out.println();
        Integer[] ans=bits.toArray(new Integer[0]);
        int count=0;
        for(int i=ans.length-1;i>=0;i--){
            System.out.print(ans[i]+" ");
            if(ans[i]==1){
                count++;
            }
        }
        System.out.println();
        System.out.println("No of bits:"+count);
        in.close();

    }
}
