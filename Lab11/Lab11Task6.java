import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lab11Task6 extends JFrame implements ActionListener // Task5
{
  final JLabel resultLabel;
  public Lab11Task6()
  {
    setTitle("My Application");
    setSize(400,200);
    setLocation(10,200);

    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hey Priscilla");
    getContentPane().add(label);

    final JButton button = new JButton("Yes Flash");
    getContentPane().add(button);
    button.addActionListener(this);

    resultLabel = new JLabel("");
    getContentPane().add(resultLabel);


  }
public void actionPerformed(ActionEvent e)
{
  resultLabel.setText("What do you call a three humped camel?");
}


  public static void main(String[] args)
  {
         Lab11Task6 pp = new Lab11Task6();
         pp.setVisible(true);
         pp.setDefaultCloseOperation(3);
  }

}
