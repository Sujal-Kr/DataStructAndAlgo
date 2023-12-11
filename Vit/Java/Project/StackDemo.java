package Vit.Java.Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackDemo extends JFrame {

    private Stack<Integer> stack;
    private DefaultListModel<String> listModel;
    private JList<String> stackJList;

    public StackDemo() {
        stack = new Stack<>();
        listModel = new DefaultListModel<>();
        stackJList = new JList<>(listModel);

        JButton pushButton = new JButton("Push");
        JButton popButton = new JButton("Pop");
        JButton displayButton = new JButton("Display Stack");

        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Enter the number to push:");
                try {
                    int value = Integer.parseInt(input);
                    stack.push(value);
                    updateStackList();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(StackDemo.this, "Invalid input. Please enter a valid number.");
                }
            }
        });

        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    updateStackList();
                } else {
                    JOptionPane.showMessageDialog(StackDemo.this, "Stack is empty. Cannot pop.");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty()) {
                    JOptionPane.showMessageDialog(StackDemo.this, "Current Stack: " + stack.toString());
                } else {
                    JOptionPane.showMessageDialog(StackDemo.this, "Stack is empty.");
                }
            }
        });

        setLayout(new BorderLayout());

        JScrollPane scrollPane = new JScrollPane(stackJList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(pushButton);
        buttonPanel.add(popButton);
        buttonPanel.add(displayButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setTitle("Stack Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void updateStackList() 
    {
        listModel.clear();
        for (int i = stack.size() - 1; i >= 0; i--) {
            listModel.addElement(String.valueOf(stack.get(i)));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StackDemo());
    }
}