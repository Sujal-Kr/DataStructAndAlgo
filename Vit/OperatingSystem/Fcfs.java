package Vit.OperatingSystem;
import java.util.Scanner;
public class Fcfs {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Entet the no of processes:");
        int n=in.nextInt();
        int p_id[]=new int[n];
        int at[]=new int[n];
        int bt[]=new int[n];
        int ct[]=new int[n];
        int wt[]=new int[n];
        int tat[]=new int[n];
        
        int counter=1;
        for(int i=0; i<n; i++){
            p_id[i]=counter++;
        }

        for(int i=0; i<n; i++){
            System.out.println("Enter the arival time and burst time for the process"+p_id[i]);
            at[i]=in.nextInt();
            bt[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(at[min]>at[j]){
                    min=j;
                }
            }
            int temp=at[min];
            at[i]=at[min];
            at[min]=temp;

            temp=bt[min];
            bt[i]=bt[min];
            bt[min]=temp;

            temp=p_id[min];
            p_id[min]=p_id[i];
            p_id[i]=temp;
        }
        compute_completeTime(ct,at,bt);
        compute_turnAroundTime(ct,at,tat);
        compute_waitingTime(tat,wt,bt);
        display_ganttChart(p_id);
        compute_agtTime(wt,tat);

        
        in.close();
    }

    private static void display_ganttChart(int[] p_id) {
        System.out.print("Gantt Chart:");
        for(int item:p_id){
            System.out.print("P"+item+" ");
        }
        System.out.println();
    }

    private static void compute_agtTime(int[] wt, int[] tat) {
        float total_wt=0f;
        float total_tat=0f;
        for(int i=0;i<wt.length;i++){
            total_wt+=wt[i];
            total_tat+=tat[i];
        }
        System.out.println("Average Waiting Time:"+total_wt/wt.length);
        System.out.println("Average Turn Around Time"+total_tat/tat.length);

    }

    private static void compute_waitingTime(int[] tat, int[] wt, int[] bt) {

        for(int i=0; i<tat.length; i++) {
            wt[i]=tat[i]-bt[i];
        }
    }
    
    private static void compute_turnAroundTime(int[] ct, int[] at, int[] tat) {

        for(int i=0; i<at.length; i++) {
            tat[i]=ct[i]-at[i];
        }
    }
    
    private static void compute_completeTime(int[] ct, int[] at, int[] bt) {

        ct[0]=at[0]+bt[0];
        for(int i=1;i<at.length;i++){
            if(ct[i-1]>=at[i]){
                ct[i]=bt[i]+ct[i-1];
            }
            else{
                ct[i]=bt[i]+ct[i-1]+Math.abs(ct[i-1]-at[i]);;
            }
        }
    }
}
