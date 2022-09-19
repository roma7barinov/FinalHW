package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {

    public static void main(String[] args) {

        JFrame mainframe = new JFrame();
        mainframe.setTitle("Крестики-нолики");
        mainframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainframe.setBounds(300,300,300,300);
        mainframe.setVisible(true);
        Font font = new Font("Arial",Font.BOLD,20);

        mainframe.setLayout(new GridLayout(3,3));
        JButton[] button = new JButton[9];
        for (int i = 0; i < 9; i++) {
            button[i] = new JButton();



            mainframe.add(button[i]);
        }
        mainframe.setVisible(true);


        button[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[0].setText("X");
                button[0].setFont(font);
            }
        });
        button[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[1].setText("X");
                button[1].setFont(font);
            }
        });
        button[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[2].setText("X");
                button[2].setFont(font);
            }
        });
        button[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[3].setText("X");
                button[3].setFont(font);
            }
        });
        button[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[4].setText("X");
                button[4].setFont(font);
            }
        });
        button[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[5].setText("X");
                button[5].setFont(font);
            }
        });
        button[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[6].setText("X");
                button[6].setFont(font);
            }
        });
        button[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[7].setText("X");
                button[7].setFont(font);
            }
        });
        button[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button[8].setText("X");
                button[8].setFont(font);
            }
        });





    }
}
