import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TwoButtonsOnFrame {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtonsOnFrame gui = new TwoButtonsOnFrame();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonLabel = new JButton("Change Label");
        buttonLabel.addActionListener(new LabelListener());

        JButton colourButton = new JButton("Change Circle");

        colourButton.addActionListener(new ColorListener());

        label = new JLabel("I'm label");
        DrawPanel drawPanel = new DrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, colourButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, buttonLabel);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(140, 140);
        frame.setVisible(true);

    }

    public class LabelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("DONE");

        }
    }

    private class ColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}
