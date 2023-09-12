package Vit.OperatingSystem;
import java.util.*;
public  class  RoundRobin {
    static class process{
        int pId, bt, ct, at, wt, tat ,rem;
        
        process(int pId,int at,int bt){
            this.pId=pId;
            this.at=at;
            this.bt=bt;
            this.rem=bt;
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<process> list=new ArrayList<>();
        
       
        System.out.println("Enter the no of Processes");
        int n=in.nextInt();
        System.out.println("Enter time Quantam");
        int t=in.nextInt();
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
        round_robin(list,t);
        compute_avgTime(list);
        
        in.close();
    }
    public static void round_robin(ArrayList<process> list, int t) {
        Queue<process> rq=new LinkedList<process>();
        rq.add(list.get(0));
        int curr_time=list.get(0).at;
        int count=0;
        System.out.print("Gantt Chart ---> ");
        while(count<list.size()) {
                process curr=rq.poll();
                if(curr!=null){
                    if(curr.rem<=t  ){
                        curr_time+=curr.rem;
                        curr.rem=0;
                        curr.ct=curr_time;
                        curr.tat=curr.ct-curr.at;
                        curr.wt=curr.tat-curr.bt;
                        count++;
                        System.out.print("P"+curr.pId+" ");
                    }
                    else{
                        System.out.print("P"+curr.pId+" ");
                        curr.rem-=t;
                        curr_time+=t;
                    }
                }
                
                for(int i=0;i<list.size();i++){
                        if(curr!=list.get(i)&&list.get(i).at<=curr_time&&list.get(i).rem!=0&&!rq.contains(list.get(i))){
                            rq.add(list.get(i));
                        }
                    }
                if(curr!=null&&curr.rem!=0)rq.add(curr);
                if(rq.isEmpty()){
                    curr_time++;
                }
            }
            display_chart(list);
        
    }
    
    public static void compute_avgTime(ArrayList<process> list) {
        double total_wt=0;
        double total_tat=0;

        for(int i=0;i<list.size();i++) {
            total_wt+=list.get(i).wt;
            total_tat+=list.get(i).tat;
        }
        System.out.println("Average TurnAroundTime: " + total_tat/list.size());
        System.out.println("Average WaitingTime: " + total_wt/list.size());
    }
    
    
    public static void display_chart(ArrayList<process> list) {
        
        System.out.println("\np_id\tat\tbt\tct\ttat\twt\t");
        for(process item:list){
            System.out.println(item.pId+"\t"+item.at+"\t"+item.bt+"\t"+item.ct+"\t"+item.tat+"\t"+item.wt);
        }
    }
   
    
}
