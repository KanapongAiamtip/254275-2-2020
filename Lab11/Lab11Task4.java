import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
public class Lab11Task4 extends JFrame
{

  public Lab11Task4()
  {
    setTitle("My Application");
    setSize(350,200);
    setLocation(10,200);

    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hello Mor Nor");
    getContentPane().add(label);

    final JButton button = new JButton("Yes Flash");
    getContentPane().add(button);

    final JButton button2 = new JButton("No Flash");//add new button
    getContentPane().add(button2);


  }




  public static void main(String[] args)
  {
         Lab11Task4 pp = new Lab11Task4();
         pp.setVisible(true);
         pp.setDefaultCloseOperation(3);
  }

}
