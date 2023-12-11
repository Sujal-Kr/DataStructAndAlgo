package Practice;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class MusicPlayer extends JFrame {
    LinkedList<String> music;
    JList<String> list;
    DefaultListModel<String> model;
    JButton add;
    JButton remove;

    MusicPlayer(){
        setTitle("Music Player");
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        music = new LinkedList<String>();
        model = new DefaultListModel<String>();
        list = new JList<String>(model);
        remove = new JButton("Remove");
        add=new JButton("Add Music");

        panel.add(remove,BorderLayout.CENTER);
        add(list);
        panel.add(add,BorderLayout.CENTER);
        add(panel,BorderLayout.SOUTH);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String song=JOptionPane.showInputDialog("Add Music");
                music.add(song);
                System.out.println(music);
                model.addElement(song);
            }
        });
        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int index=list.getSelectedIndex();
                if(model.size()!=0&&index!=-1){
                    model.remove(index);
                }else{
                    model.remove(0);
                }
            }
        });
        
        setVisible(true);
        setSize(500,500);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new MusicPlayer();
    }
}
