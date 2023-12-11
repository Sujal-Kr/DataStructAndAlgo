package Vit.Java.Project;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mp3 extends JFrame{
    JButton add_song;
    JButton remove_song;
    JList<String> list;
    DefaultListModel<String> model;
    Mp3(){
        setLayout(new BorderLayout());
        add_song = new JButton("Add Song");
        remove_song = new JButton("Remove Song");
        JPanel btn_panel = new JPanel();
        btn_panel.add(add_song,BorderLayout.CENTER);
        btn_panel.add(remove_song,BorderLayout.CENTER);
        model = new DefaultListModel<String>();
        list=new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane, BorderLayout.CENTER);
        add(btn_panel,BorderLayout.SOUTH);
        add_song.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String song=JOptionPane.showInputDialog("Enter a song");
                if(song!=""&&!model.contains(song)){
                    model.addElement(song);
                }
            }
        });
        remove_song.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int index=list.getSelectedIndex();
                if(index!=-1){
                    model.remove(index);
                }
            }
        });
        setTitle("Music Player");
        setLocationRelativeTo(null);
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Mp3();
    }
}
