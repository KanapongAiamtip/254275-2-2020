import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lab11Task7 extends JFrame implements ActionListener
{
  JLabel pp;
  JButton ok;
  public Lab11Task7()
  {
    setTitle("My Application");
    setSize(300,200);
    setLocation(10,200);

    setLayout(new FlowLayout());
    final JLabel label = new JLabel("Hey Priscilla");
    getContentPane().add(label);

    final JButton button = new JButton("Yes Flash?");
    getContentPane().add(button);
    button.addActionListener(this);

    ok = new JButton("punch");
    ok.setActionCommand("x");
    getContentPane().add(ok);
    ok.addActionListener(this);


    pp = new JLabel();
    getContentPane().add(pp);

  }
  public void actionPerformed(ActionEvent e)
  {
      JButton bk = (JButton) e.getSource();
      if (bk.getActionCommand().equals("x"))
      {
        pp.setText("Pregnent");
      }
      else
      {
        pp.setText("What do you call a three humped camel?");
      }
  }


  public static void main(String[] args)
  {
         Lab11Task7 pp = new Lab11Task7();
         pp.setVisible(true);
         pp.setDefaultCloseOperation(3);
   }

}
