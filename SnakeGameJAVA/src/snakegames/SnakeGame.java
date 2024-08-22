package snakegames;
import javax.swing.*;

public class SnakeGame {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakePanel panel=new SnakePanel();
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
        
        panel.startGame();
    }
}
