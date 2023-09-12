

package Vit.Assignement;
import java.util.*;
public class TvControlSystem {
    int channel;
    int volume;
    boolean state;// rename to 'on'
    
    TvControlSystem(){
        this.channel = 1;
        this.volume =1;
        this.state=false;
        System.out.println("Max channel is 100");// remove 
        System.out.println("Max volume is 7");// remove
    }
    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        TvControlSystem s=new TvControlSystem();
        System.out.println("1. Turn the TV on");
        System.out.println("2. Turn the TV off");
        System.out.println("3. Set the channel");
        System.out.println("4. Change the channel up");
        System.out.println("5. Change the channel down");
        System.out.println("6. Set the volume level");
        System.out.println("7. Increase the volume");
        System.out.println("8. Decrease the volume");
        System.out.println("9. Exit the program");
        boolean menu=true;
        while(menu){
            System.out.print("Enter the command ");
            int c=in.nextInt();
            switch(c){
            case 1: s.turnOn();
                    break;
            case 2: s.turnOff();
                    break;
            case 3: System.out.println("Enter the channel number");
                    int val=in.nextInt();
                    s.setChannel(val);
                    break;
            case 4: s.channelUp();
                    break;
            case 5: s.channelDown();
                    break;
            case 6: System.out.println("Enter the Volume number");
                    val=in.nextInt();
                    s.setVolume(val);
                    break;
            case 7: s.volumeUp();
                    break;
            case 8: s.volumeDown();
                    break;
            case 9: menu=false;
                    break;
            default:System.out.println("Invalid Command");
            break;

            }
        }
        in.close();
        
    }  

    public void turnOn(){
        this.state=true;
        System.out.println("Televison is on");
    }
    public void turnOff(){
        this.state=false;
        System.out.println("Televison is off");
    }
    public void setChannel(int channel){
        if(!state){
            System.out.println("Operation not allowed ,televison is off Press 1 to turn on");
            return;
        }
        if(channel >=1&&channel <=100){
            this.channel = channel;
            System.out.println("Channel set to " + channel);
        }
        else{
            System.out.println("Invalid channel");
        }
    }
    public void setVolume(int volume){
        if(!state){
            System.out.println("Operation not allowed ,televison is off Press 1 to turn on");
            return;
        }
        if(volume >=1&&volume <=7){
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        }
        else{
            System.out.println("Invalid volume");
        }

    }
    public void channelUp(){
        if(!state){
            System.out.println("Operation not allowed ,televison is off Press 1 to turn on");
            return;
        }
        if(this.channel <100){
            this.channel ++;
            System.out.println("Chanel incremented to " + this.channel);
        }
        else{
            System.out.println("Max channel limit reached");
        }
    }
    public void channelDown(){
        if(!state){
            System.out.println("Operation not allowed ,televison is off Press 1 to turn on");
            return;
        }
        if(this.channel >1){
            this.channel --;
            System.out.println("Chanel decremented to " + this.channel);
        }
        else{
            System.out.println("Min channel limit reached");
        }

    }
    public void volumeUp(){
        if(!state){
            System.out.println("Operation not allowed ,televison is off Press 1 to turn on");
            return;
        }
        if(this.volume >7){
            this.volume ++;
            System.out.println("Volume incremented to " + this.volume);
        }
        else{
            System.out.println("Max volume limit reached");
        }
        
    }
    public void volumeDown(){
        if(!state){
            System.out.println("Operation not allowed ,televison is off Press 1 to turn on");
            return;
        }
        if(this.volume <1){
            this.volume --;
            System.out.println("Volume decremented to " + this.volume);
        }
        else{
            System.out.println("min volume limit reached");
        }
    }
    
}
