package Vit.Java.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class MusicPlayerDemo extends JFrame 
{

    private LinkedList<String> playlist;
    private DefaultListModel<String> listModel;
    private JList<String> playlistJList;

    public MusicPlayerDemo() 
    {
        playlist = new LinkedList<>();
        listModel = new DefaultListModel<>();
        playlistJList = new JList<>(listModel);

        JButton addButton = new JButton("Add Song");
        JButton removeButton = new JButton("Remove Song");

        addButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String newSong = JOptionPane.showInputDialog("Enter the song name:");
                if (newSong != null && !newSong.trim().isEmpty()) 
                {
                    int selectedIndex = playlistJList.getSelectedIndex();
                    if (selectedIndex == -1)
                     {
                        playlist.add(newSong);
                        listModel.addElement(newSong);
                    } 
                    else 
                    {
                        playlist.add(selectedIndex, newSong);
                        listModel.add(selectedIndex, newSong);
                    }
                }
            }
        });

        removeButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                int selectedIndex = playlistJList.getSelectedIndex();
                if (selectedIndex != -1) 
                {
                    playlist.remove(selectedIndex);
                    listModel.remove(selectedIndex);
                }
            }
        });

        setLayout(new BorderLayout());

        JScrollPane scrollPane = new JScrollPane(playlistJList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setTitle("Music Player Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> new MusicPlayerDemo());
    }
}