import javax.swing.*;
import java.awt.*;

public class ProgressDialog {

    public static void main(String[] args) {
      JFrame frame = new JFrame("SetBounds Method Test");
      frame.setSize(500, 200);
      // Setting layout as null
      frame.setLayout(null);
      // Creating Button
      JProgressBar progBar = new JProgressBar(0,100);
      progBar.setSize(280, 30);
        progBar.setBounds(150,50,280, 30);
        progBar.setValue(0);
      //JButton button = new JButton("Hello Java");
      // Setting position and size of a button
      //button.setBounds(80,30,120,40);
      //frame.add(button);
      frame.add(progBar);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
    }
    
}
