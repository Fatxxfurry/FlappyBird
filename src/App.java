import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardHeight = 640;
        int boardWidth = 360;

        JFrame mainFrame = new JFrame("Flappy Bird");
        mainFrame.setSize(boardWidth, boardHeight);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        
        FlappyBird flappyBird = new FlappyBird();
        mainFrame.add(flappyBird);
        mainFrame.pack();
        flappyBird.requestFocus();
        mainFrame.setVisible(true);
    }
}
