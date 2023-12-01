package main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new Color(30, 31, 34));
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(800, 800));
        frame.setLocationRelativeTo(null);
        Board board = new Board();
        frame.add(board);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon(ClassLoader.getSystemResource("chess.png")).getImage());
        frame.setVisible(true);
    }
}

/**********************************************************
 **  ©Med0X All rights reserved to me @MrMdrX in Github  **
 **               https://mrmdrx.github.io               **
 *********************************************************/