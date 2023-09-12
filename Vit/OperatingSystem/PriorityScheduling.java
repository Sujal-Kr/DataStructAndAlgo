package Vit.OperatingSystem;
import java.util.*;
public  class  PriorityScheduling {
    static class process{
        int pId, bt, ct, at, wt, tat,p;
        boolean completed;
        process(int pId,int p, int at,int bt){
            this.pId=pId;
            this.p=p;
            this.at=at;
            this.bt=bt;
            this.completed=false;
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<process> list=new ArrayList<>();
        
       
        System.out.println("Enter the no of Processes");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the priority arival time and burst time of procces P "+(i+1));
            int p=in.nextInt();
            int at=in.nextInt();
            int bt=in.nextInt();
            list.add(new process(i+1,p, at, bt));
        }
        
        sort(list);
        priority_scheduling(list);
        display_table(list);
        compute_avgTime(list);
        in.close();
    }
    public static void sort(ArrayList<process> list) {
        Collections.sort(list,new Comparator<process>() {
          public int compare(process a, process b) {
            if(a.at==b.at){
                return  Integer.compare(a.p, b.p);
            }
            else{
                return Integer.compare(a.at, b.at);
            }
          }
        });
    }
    private static void priority_scheduling(ArrayList<process> list) {
        PriorityQueue<process> pq = new PriorityQueue<process>((a,b)-> a.p - b.p);
        int count=0;
        System.out.print("Gantt Chart----> ");
        int curr_time=list.get(0).at;
        while(count<list.size()){
           for(process item : list){
                if(!item.completed&&item.at<=curr_time){
                    
                    pq.add(item);
                    item.completed=true;
                }
           }
           if(!pq.isEmpty()){
                process curr=pq.poll();
                System.out.print("P"+curr.pId+" ");
                curr_time+=curr.bt;
                curr.ct=curr_time;
                curr.tat=curr.ct-curr.at;
                curr.wt = curr.tat-curr.bt;
                count++;
           }
        }
    }
   
    
    public static void compute_avgTime(ArrayList<process> list) {
        float total_wt=0;
        float total_tat=0;

        for(int i=0;i<list.size();i++) {
            total_wt+=list.get(i).wt;
            total_tat+=list.get(i).tat;
        }
        System.out.println("Average TurnAroundTime: " + total_tat/list.size());
        System.out.println("Average WaitingTime: " + total_wt/list.size());
    }
    public static void display_table(ArrayList<process> list) {
        System.out.println("\np_id\tp\tat\tbt\tct\ttat\twt\t");
        for(process item:list){
            System.out.println(item.pId+"\t"+item.p+"\t"+item.at+"\t"+item.bt+"\t"+item.ct+"\t"+item.tat+"\t"+item.wt);
        }
    }
    
}
