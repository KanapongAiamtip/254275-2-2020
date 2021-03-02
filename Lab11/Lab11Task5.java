import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lab11Task5 extends JFrame implements ActionListener 
{
  public Lab11Task5()
  {
    setTitle("My Application");
    setSize(300,200);
    setLocation(10,200);

    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hello Mor Nor");
    getContentPane().add(label);

    final JButton button = new JButton("Yes Flash");
    getContentPane().add(button);
    button.addActionListener(this);

  }
  public void actionPerformed(ActionEvent e)
  {
     System.out.println("What do you call?");
  }


  public static void main(String[] args)
  {
         Lab11Task5 pp = new Lab11Task5();
         pp.setVisible(true);
         pp.setDefaultCloseOperation(3);
  }

}
