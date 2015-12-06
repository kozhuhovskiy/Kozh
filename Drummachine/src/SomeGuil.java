import javax.swing.*;

public class SomeGuil {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click Ok :-)");
        JButton button2 = new JButton(" (X) ");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


       /* frame.getContentPane().add(button);
        frame.setSize(500, 700);
        frame.setVisible(true);*/
        frame.getContentPane().add(button2);
        frame.setSize(120,202);

        frame.setVisible(true);
    }
    public void changeIt(JButton button){
        button.setText("changed");

    }


}
