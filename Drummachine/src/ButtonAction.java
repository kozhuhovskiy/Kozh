import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        ButtonAction bGui = new ButtonAction();
        bGui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
    public void  actionPerformed(ActionEvent event){
        button.setText("clicked");
    }
  }
