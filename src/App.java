import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardHeight = 360;
        int boardWidth = 640;

        JFrame mainFrame = new JFrame();
        mainFrame.setSize(boardWidth, boardHeight);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

        FlappyBird flappyBird = new FlappyBird();
        mainFrame.add(flappyBird);
        mainFrame.pack();
    }
}
