import javax.swing.*;
import java.awt.*;
public class FlappyBird extends JPanel {
    int boardHeight = 360;
    int boardWidth = 640;

    Image backgroundImg;

    FlappyBird() {
        setPreferredSize(new Dimension(boardHeight, boardWidth));
        setBackground(Color.BLUE);
        backgroundImg = new ImageIcon(getClass().getResource("/flappybirdbg.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImg, 0, 0, null);
    }
}
