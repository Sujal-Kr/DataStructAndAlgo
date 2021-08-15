package Practices;
import java.util.Scanner;
public class TimeConverstion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the time in 12 hrs Clock time:");
        String s=in.nextLine();
        String[] newtime=s.split(":");
        String ntime="";
        
        int hr=Integer.parseInt(newtime[0]);
        String min=newtime[1].substring(0,2);
        String sec=newtime[2].substring(0,2);
        String meridian=newtime[2].substring(2,4);
        
        if(meridian.equalsIgnoreCase("AM")){
            ntime=s.substring(0, 8);
        }
        else{
            
            if(hr==12){
                String zero="00";
                ntime=zero+":"+min+":"+sec;
                
            }
            else{
                hr=hr+12;
                ntime=hr+":"+min+":"+sec;
            }
            
        }
        System.out.println(ntime);
        in.close();
    }
}
