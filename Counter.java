import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDirection implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

  ButtonDirection() {
    JFrame frame = new JFrame("Let's Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    int leftCount = 0; 
    int rightCount = 0; 

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right); 

    leftLabel = new JLabel("Count: "+ leftCount); 

    rightLabel = new JLabel("Count: "+ rightCount);

    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);
    frame.add(reset);

    frame.setVisible(true);

public void actionPerformed(ActionEvent ae) {
  if(ae.getActionCommand().equals("Left")) {
    leftLabel.setText("Count: "+leftCount);
  }
  else {
    label.setText(leftCount ++);
  }
   if(ae.getActionCommand().equals("Right")) {
    rightLabel.setText("Count: "+rightCount);
  }
  else {
    label.setText(rightCount ++);
  }
  if(ae.getActionCommand().equals("Reset")) {
    leftLabel.setText("0");
  }
}
  

