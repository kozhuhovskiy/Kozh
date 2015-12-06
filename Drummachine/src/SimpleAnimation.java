import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 70;
    int y = 70;


    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(250, 250);
        frame.setVisible(true);

        for (int i = 0; i < 390; i++) {

            x++;
            y++;
            drawPanel.repaint();


            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics graphics) {

        graphics.setColor(Color.white);
        graphics.fillRect(0,0,this.getWidth(),this.getHeight());

        graphics.setColor(Color.green);

        graphics.fillOval(x,y,40,40);
    }
}
}
