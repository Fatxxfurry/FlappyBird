import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlappyBird extends JPanel implements ActionListener, KeyListener {
    int boardHeight = 640;
    int boardWidth = 360;

    Image backgroundImg;
    Image birdImg;

    // bird
    public class Bird {
        int x=boardWidth/8;
        int y=boardHeight/2;
        int width=34;
        int height=24;
        Image img;

        Bird(Image img) {
            this.img = img;
        }
    }

    Bird bird;
    int velocityY = 0;
    int gravity = 1;

    Timer gameLoop;

    FlappyBird() {
        setPreferredSize(new Dimension(boardWidth, boardHeight));

        setFocusable(true);
        addKeyListener(this);

        setBackground(Color.BLUE);
        backgroundImg = new ImageIcon(getClass().getResource("/flappybirdbg.png")).getImage();

        birdImg = new ImageIcon(getClass().getResource("/flappybird.png")).getImage();

        bird = new Bird(birdImg);

        gameLoop = new Timer(1000 / 16, this);
        gameLoop.start();
    }

    public void move() {
        velocityY += gravity;
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0);
        bird.y = Math.min(bird.y, boardHeight-bird.height);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImg, 0, 0, null);
        g.drawImage(bird.img, bird.x, bird.y,bird.width, bird.height, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_SPACE) {
            velocityY = -9;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
