
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LayoutMain {

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(500, 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
    panel1.setBackground(Color.red);

    panel1.setPreferredSize(new Dimension(200, 500));
    for (int i = 1; i <= 10; i++) {
      panel1.add(new JButton("Button " + i));
    }

    final int gapOut = 15;
    final int gapIn = 10;

    Box verticalBox = Box.createVerticalBox();

    verticalBox.add(Box.createRigidArea(new Dimension(0, gapOut)));
    for (int i = 1; i <= 10; i++) {
      verticalBox.add(new JTextField("TextField" + i));
      if (i < 10) {
        verticalBox.add(Box.createRigidArea(new Dimension(0, gapIn)));
      }
    }
    verticalBox.add(Box.createRigidArea(new Dimension(0, gapOut)));

    Box horizontalBox = Box.createHorizontalBox();
    horizontalBox.setPreferredSize(new Dimension(200, 500));
    horizontalBox.setBackground(Color.blue);
    horizontalBox.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
    horizontalBox.setOpaque(true);

    horizontalBox.add(Box.createRigidArea(new Dimension(gapOut, 0)));
    horizontalBox.add(verticalBox);
    horizontalBox.add(Box.createRigidArea(new Dimension(gapOut, 0)));

    frame.add(horizontalBox, BorderLayout.LINE_END);
    frame.add(panel1, BorderLayout.LINE_START);

    JPanel top = new JPanel();
    top.setBackground(Color.green);
    frame.add(top, BorderLayout.PAGE_START);

    JPanel bottom = new JPanel();
    bottom.setBackground(Color.yellow);
    frame.add(bottom, BorderLayout.PAGE_END);

    JPanel center = new JPanel();
    center.setBackground(Color.orange);
    frame.add(center, BorderLayout.CENTER);

    frame.setVisible(true);
  }

}
