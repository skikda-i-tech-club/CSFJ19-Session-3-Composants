
import javax.swing.JFrame;

public class FenetresMain {

  public static void main(String[] args) {
    JFrame frame1 = new JFrame();
    frame1.setTitle("Frame 1");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(400, 100);
    // centrer le composant sur l'écran.
    frame1.setLocationRelativeTo(null);
    frame1.setVisible(true);

    JFrame frame2 = new JFrame("Frame 2");
    frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    // setBounds = setLocation + setSize
    frame2.setBounds(0, 300, 500, 100);
    frame2.setVisible(true);
  }

}
