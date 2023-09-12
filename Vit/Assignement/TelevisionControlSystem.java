package Vit.Assignement;

import java.util.Scanner;

public class TelevisionControlSystem
{
  int channel = 1; // Default channel is 1
  int volumeLevel = 10; // Default volume level is 1
  boolean on = false; // By default TV is off
  

 

  public void turnOn() 
  {
    on = true;
    System.out.println("TV is turned on");
  }
  
  public void turnOff() 
  {
    on = false;
    System.out.println("TV is turned off");
  }
  
  public void setchannel(int channel) 
  {
    if (on && channel >= 1 && channel <= 120){
  this.channel = channel;
      System.out.println("Channel set to"+channel);
    }else {
      System.out.println("Invalid channel.");
  }
  }
  
  public void setVolume(int newVolumeLevel) 
  {
    if (on && newVolumeLevel >= 0 && newVolumeLevel <= 10){
      this.volumeLevel = newVolumeLevel;
      System.out.println("Volume is:"+volumeLevel);
    } else {
      System.out.println("Invalid volume.");
  }
  }
  
  public void channelUp() 
  {
    if (on && channel < 120)
    
      this.channel++;
      System.out.println("channel changed to"+channel);
    
      
  }
  
  public void channelDown() {
    if (on && channel > 1)
      this.channel--;
      System.out.println("channel changed to"+channel);
  }
  
  public void volumeUp() {
    if (on && volumeLevel < 10)
      this.volumeLevel++;
      System.out.println("volume level is"+volumeLevel);
  }
  
  public void volumeDown() {
    if (on && volumeLevel > 0)
      this.volumeLevel--;
      System.out.println("Volume level is"+volumeLevel);
  }


  public static void main(String[] args) {
    
  Scanner sc= new Scanner(System.in);
  TelevisionControlSystem s = new TelevisionControlSystem();
  
    
    System.out.println("Welcome to the Television Control System");
    System.out.println("---------------------------------------");
    System.out.println("\n TV is currently off");
    System.out.println("\nMenu:");
    System.out.println("1. Turn the TV On");
    System.out.println("2.Turn the TV off");
    System.out.println("3. Set the channel");
    System.out.println("4. Change the channel up");
    System.out.println("5. Change the channel down");
    System.out.println("6. Set the Volume level");
    System.out.println("7. Increase the Volume");
    System.out.println("8. Decrease the Volume");
    System.out.println("9. Exit the program");
    
    
    int flag = 1;
    while(flag != 0) {
        System.out.println("Enter your choice");
        int n=sc.nextInt();
        switch(n) {
            case 1: s.turnOn();
                    break;
            case 2: s.turnOff();
                    break;
            case 3: System.out.println("Enter the channel no.");
                    int val=sc.nextInt();
                    s.setchannel(val);
                    break;
            case 4: s.channelUp();
                    break;
            case 5: s.channelDown();
                    break;
            case 6: System.out.println("Enter the Volume no.");
                    val=sc.nextInt();
                    s.setVolume(val);
                    break;
            case 7: s.volumeUp();
                    break;
            case 8: s.volumeDown();
                    break;
            case 9: flag=0;
                    break;
            default:System.out.println("Wrong Input");
            break;

        }
    }
    
} 

}

