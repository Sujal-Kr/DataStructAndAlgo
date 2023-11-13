package Projects;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class BullsAndCows extends JFrame {
    JButton start,genButton;
    JTextArea rules;
    JTextField userNum;
    
    BullsAndCows(){
        setTitle("Bulls and Cows");
        setSize(300 ,300);
        setLayout(new FlowLayout());
        setVisible(true);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               
            }
        });
    }

    public static void main(String[] args) {
        new BullsAndCows();
        int arr[]=generateNumber();
        int user[]={5,4,2,1};
        solution(arr,user);

    }

    private static int[] generateNumber() {
        int comp[]=new int[4];
        for(int i=0;i<comp.length;i++){
            comp[i]=(int)(Math.random()*10);
        }
        return comp;
    }

    private static void solution(int[] arr, int[] user) {
        Map<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(arr[i],new ArrayList<Integer>());
            map.get(arr[i]).add(i);
        }
        System.out.println(map);
        int bulls=0;
        int cows=0;
        for (int i = 0; i < user.length; i++) {
            boolean index_matched=false;
            if(map.containsKey(user[i])){
                for(int item:map.get(user[i])){
                    if(item==i){
                        bulls++;
                        index_matched=true;
                        break;
                    }
                }
                if(!index_matched)cows++;
            }
        }
        System.out.println("No of bulls "+bulls);
        System.out.println("No of Cows "+cows);
    }

}
