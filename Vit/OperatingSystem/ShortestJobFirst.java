package Vit.OperatingSystem;
import java.util.*;


public  class  ShortestJobFirst {
    static class process{
        int pId, bt, ct, at, wt, tat;
        boolean completed;
        process(int pId,int at,int bt){
            this.pId=pId;
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
            System.out.println("Enter the arival and burst time of procces P "+(i+1));
            int at=in.nextInt();
            int bt=in.nextInt();
            list.add(new process(i+1, at, bt));
        }

        
        sort(list);
        apply_sjf(list);
        display_table(list);
        compute_avgTime(list);
        in.close();
    }
    public static void sort(ArrayList<process> list) {
        Collections.sort(list,new Comparator<process>() {
            public int compare(process a, process b) {
                if (a.at == b.at) {
                    return Integer.compare(a.bt, b.bt); 
                } else {
                    return Integer.compare(a.at, b.at); 
                }   
            }
        });
    }
    public static void apply_sjf(ArrayList<process> list) {
        int count = 0;
        int curr_time = list.get(0).at;  
        System.out.print("Gantt chart---> ");
        PriorityQueue<process> pq = new PriorityQueue<>((a, b) -> a.bt - b.bt);
        while (count < list.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).completed && list.get(i).at <= curr_time) {
                    pq.add(list.get(i));
                    list.get(i).completed = true;
                }
            }
    
            if (pq.isEmpty() && count < list.size()) {
                curr_time++;
                continue;
            }
    
            process curr = pq.poll();
            System.out.print("P"+curr.pId+" ");
            curr_time += curr.bt;
            curr.ct = curr_time;
            curr.tat=curr.ct-curr.at;
            curr.wt = curr.tat-curr.bt;
            count++;
        }
    }
    
    
    public static void display_ganttChart(ArrayList<process> list) {
        System.out.print("Gantt Chart--->");
        for(process item : list){
            System.out.print("P"+item.pId+" ");
        }
        System.out.println();
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
        System.out.println("\np_id\tat\tbt\tct\ttat\twt\t");
        for(process item:list){
            System.out.println(item.pId+"\t"+item.at+"\t"+item.bt+"\t"+item.ct+"\t"+item.tat+"\t"+item.wt);
        }
    }
  
}
