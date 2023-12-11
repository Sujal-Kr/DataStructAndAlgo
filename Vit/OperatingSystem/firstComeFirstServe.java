package Vit.OperatingSystem;
import java.util.*;
public  class  firstComeFirstServe {
    static class process{
        int pId, bt, ct, at, wt, tat;
        
        process(int pId,int at,int bt){
            this.pId=pId;
            this.at=at;
            this.bt=bt;
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<process> list=new ArrayList<>();
        
       
        System.out.println("Enter the no of Processes");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the arival and burst time of procces P "+(i+1));
            int at=in.nextInt();
            int bt=in.nextInt();
            list.add(new process(i+1, at, bt));
        }

        
        Collections.sort(list,new Comparator<process>() {
          public int compare(process a, process b) {
            return a.at-b.at;   
          }
        });
       
        display_ganttChart(list);
        compute_completionTime(list);
        compute_turnAroundTime(list);
        compute_waitingTime(list);
        solution(list);
        compute_avgTime(list);
        in.close();
    }
    private static void display_ganttChart(ArrayList<process> list) {
        System.out.print("Gantt Chart--->");
        for(process item : list){
            System.out.print("P"+item.pId+" ");
        }
        System.out.println();
    }
    private static void compute_avgTime(ArrayList<process> list) {
        double total_wt=0;
        double total_tat=0;

        for(int i=0;i<list.size();i++) {
            total_wt+=list.get(i).wt;
            total_tat+=list.get(i).tat;
        }
        
        System.out.println("Average TurnAroundTime: " + total_tat/list.size());
        System.out.println("Average WaitingTime: " + total_wt/list.size());
    }
    private static void compute_waitingTime(ArrayList<process> list) {
         for(int i=0;i<list.size();i++){
            list.get(i).wt=list.get(i).tat-list.get(i).bt;
        }
    }
    private static void compute_turnAroundTime(ArrayList<process> list) {
        for(int i=0;i<list.size();i++){
            list.get(i).tat=list.get(i).ct-list.get(i).at;
        }
    }
    private static void solution(ArrayList<process> list) {
        System.out.println("p_id\tat\tbt\tct\ttat\twt\t");
        for(process item:list){
            System.out.println(item.pId+"\t"+item.at+"\t"+item.bt+"\t"+item.ct+"\t"+item.tat+"\t"+item.wt);
        }
    }
    private static void compute_completionTime(ArrayList<process> list) {
        list.get(0).ct=list.get(0).at+list.get(0).bt;
        for(int i=1;i<list.size();i++){
            if(list.get(i-1).ct>=list.get(i).at){
                list.get(i).ct=list.get(i-1).ct+list.get(i).bt;
            }
            else{
                list.get(i).ct=list.get(i-1).ct+list.get(i).bt+Math.abs(list.get(i-1).ct-list.get(i).at);
            }
        }
    }
}
