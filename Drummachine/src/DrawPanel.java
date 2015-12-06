import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

   /* public void paintComponent2(Graphics graphics){

        graphics.setColor(Color.orange);

        graphics.fillRect(20, 50, 100, 100);
    }*/

    public void paintComponent(Graphics graphics){

        Image image = new ImageIcon("C:\\ideaProjects\\Kozh\\Drummachine\\src\\girl.jpg").getImage();
        graphics.drawImage(image, 3,4, this);

    }
}
