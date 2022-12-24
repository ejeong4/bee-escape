
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

/*
Emily Jeong
Lab Section 13
Thu Nov 10 2022
*/

public class BeeGame extends JFrame{
	Color color;
    Canvas canvas = new Canvas();
    JPanel scoreboard = new JPanel();
    JLabel scorelabel = new JLabel();
    JLabel enter = new JLabel();
    int score;

    public BeeGame() {
        super("Bee Game 3");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 557);
        setResizable(false);
        setLayout(new BorderLayout());
        addKeyListener(new Keys(this));
        
        scoreboard.setPreferredSize(new Dimension(100, 50));
        scoreboard.setBackground(color.GRAY);
        
        scorelabel.setText("Score: " + score);
        scorelabel.setFont(new Font("San Serif", Font.PLAIN, 28));
        enter.setText("[Press Enter to Start!]");
        enter.setFont(new Font("San Serif", Font.PLAIN, 24));
        
        
//        scoreboard.add(Box.createHorizontalStrut(200));
        scoreboard.add(enter);
        scoreboard.add(scorelabel);
        
        add(canvas, BorderLayout.CENTER);
        add(scoreboard, BorderLayout.NORTH);
        
    }
    
    public static void main(String args[]) {
        new BeeGame();
    }
}







