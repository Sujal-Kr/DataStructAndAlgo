package Projects;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class BullsAndCows extends JFrame {
    JButton start;
    JTextArea rules;
    
    BullsAndCows(){
        setTitle("Bulls and Cows");
        setSize(300,300);
        setBackground(Color.GREEN);
        start=new JButton("Start");
        rules=new JTextArea();
        rules.setText("Let me Introduce you to the Rules.\n" +
        "Guess any four-digit number. If the digits match with the ones of the number present in the computer's number with the same indexing, then you get +1 bull. If the index does not match, then you get +1 cow.\n" +
        "Example:\n" +
        "Secret number: 4271\n" +
        "Opponent's number: 1234\n" +
        "So you get 1 bull for 2 and two cows for 4 and 1.\n" +
        "Hope you got it. If not, then go visit a primary teacher. You dumb computer has decided its number.");
        rules.setWrapStyleWord(true);
        rules.setLineWrap(true);
        rules.setMargin(new Insets(2, 2, 2, 2));
        add(rules);
        add(start);
        setLayout(new FlowLayout());
        setVisible(true);
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
