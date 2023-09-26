package Practice;
import java.util.Scanner;
public class Fcfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pId[]={0,1,2,3};
        int at[]=new int[pId.length];
        int bt[]=new int[pId.length];
        for(int i=0; i<pId.length; i++) {
            System.out.print("Enter the arival time and burst time for pId "+pId[i]+":");
            at[i]=sc.nextInt();
            bt[i]=sc.nextInt();
        }
        
        sc.close();
        solution(pId,at,bt);
    }

    public static void solution(int[] pId, int[] at, int[] bt) {
        int ct[]=new int[pId.length];
        int tat[]=new int[pId.length];
        int wt[]=new int[pId.length];
        for(int i=0; i<pId.length; i++){
            int min=i;
            for(int j=i+1; j<at.length; j++){
                if(at[j]<at[min]){
                    min=at[j];
                }
            }
            int temp=at[min];
            at[i]=at[min];
            at[min]=temp;

            temp=bt[min];
            bt[i]=bt[min];
            bt[min]=temp;

            temp=pId[min];
            pId[i]=pId[min];
            pId[min]=temp;

        }
        ct[pId[0]]=bt[pId[0]];
        for(int i=1;i<pId.length;i++){
            ct[pId[i]]=bt[pId[i]]+ct[pId[i-1]];
        }
        for(int i=0; i<pId.length; i++) {
            System.out.println(at[i]+"\t"+bt[i]+"\t"+ct[i]);
        }
    }
}
