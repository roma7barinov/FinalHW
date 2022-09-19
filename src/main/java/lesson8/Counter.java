package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Counter {
    public static int count = 0;
    private static JFrame mainFrame;

    public static void main(String[] args) {
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(300,300,400,200);
        Font font = new Font("Arial",Font.BOLD,32);

        //поле ввода




        //создаем коунтер
        JLabel label = new JLabel(String.valueOf(count));
        label.setFont(font);
        label.setHorizontalAlignment(0);
        mainFrame.add(label,BorderLayout.CENTER);

        JTextField field = new JTextField("0");
        field.setFont(font);
        field.setHorizontalAlignment(0);
        mainFrame.add(field,BorderLayout.NORTH);

        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(field.getText());
                count = Integer.parseInt(String.valueOf(label.getText()));
            }
        });





        JButton deButton = new JButton("<");
        mainFrame.add(deButton,BorderLayout.LINE_START);
        deButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(field.getText());
                label.setText(String.valueOf(count - temp));
                count = count - temp;
            }
        });

        JButton inButton = new JButton(">");
        mainFrame.add(inButton,BorderLayout.LINE_END);
        inButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = Integer.parseInt(field.getText());
                label.setText(String.valueOf(count + temp));
                count = count + temp;
            }
        });

        JButton reset = new JButton("reset");
        mainFrame.add(reset,BorderLayout.SOUTH);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    label.setText("0");
                    count = 0;
            }
        });








        mainFrame.setVisible(true);

    }
}
