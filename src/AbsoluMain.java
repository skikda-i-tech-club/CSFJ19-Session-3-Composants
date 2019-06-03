
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class AbsoluMain {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Fenetre principale");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(600, 600);
    frame.setLocationRelativeTo(null);
    // positionnement absolue.
    frame.setLayout(null);

    JMenuBar menuBar = new JMenuBar();
    frame.setJMenuBar(menuBar);

    JMenu menuFile = new JMenu("File");
    menuBar.add(menuFile);

    JMenuItem menuItemOpen = new JMenuItem("Open");
    menuFile.add(menuItemOpen);

    JMenuItem menuItemSave = new JMenuItem("Save");
    menuFile.add(menuItemSave);

    JMenu menuRecent = new JMenu("Recent");
    menuFile.add(menuRecent);

    menuRecent.add(new JMenuItem("Projet 1"));
    menuRecent.add(new JMenuItem("Projet 2"));

    menuFile.add(new JSeparator());

    JMenuItem menuItemClose = new JMenuItem("Close");
    menuFile.add(menuItemClose);

    Font font = new Font("Monospaced", Font.ITALIC, 30);

    JButton button1 = new JButton();
    button1.setText("Button");
    button1.setLocation(10, 10);
    button1.setSize(150, 100);
    button1.setFont(font);
    frame.add(button1);

    JButton button2 = new JButton("Button 2");
    button2.setBounds(170, 10, 150, 100);
    button2.setFont(font);
    frame.add(button2);

    JTextField textField = new JTextField();
    textField.setLocation(10, 120);
    textField.setSize(100, 100);
    textField.setText("Text Field");
    frame.add(textField);

    JPasswordField passwordField = new JPasswordField();
    passwordField.setLocation(120, 120);
    passwordField.setSize(100, 100);
    passwordField.setText("Text Field");
    frame.add(passwordField);

    JCheckBox checkBox = new JCheckBox("Check box");
    checkBox.setLocation(10, 230);
    checkBox.setSize(100, 100);
    checkBox.setSelected(true);
    frame.add(checkBox);

    JRadioButton radioButton = new JRadioButton("Radio Button");
    radioButton.setLocation(10, 340);
    radioButton.setSize(200, 50);
    radioButton.setSelected(true);
    frame.add(radioButton);

    JRadioButton radioButton2 = new JRadioButton("Radio Button 2");
    radioButton2.setLocation(10, 400);
    radioButton2.setSize(200, 50);
    radioButton2.setSelected(true);
    frame.add(radioButton2);

    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(radioButton);
    buttonGroup.add(radioButton2);

    JSpinner spinner = new JSpinner();
    spinner.setLocation(50, 460);
    spinner.setSize(50, 50);
    frame.add(spinner);

    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> list = new JList<>(listModel);
    list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setViewportView(list);
    scrollPane.setLocation(350, 10);
    scrollPane.setSize(200, 400);
    frame.add(scrollPane);

    for (int i = 0; i < 100; i++) {
      listModel.addElement("Element " + (i + 1));
    }

    frame.setVisible(true);
  }

}
