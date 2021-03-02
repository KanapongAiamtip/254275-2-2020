import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FracSimple extends JFrame implements ActionListener 
{
  final JTextField topField, topField2;
  final JTextField bottomField, bottomField2;
  final JLabel equalsLabel, equalsLabel1, equalsLabel2;

  public FracSimple() {
    setTitle("Fraction Calculator");
    setSize(280, 120);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    final JPanel calcPanel = new JPanel(new FlowLayout());
    getContentPane().add(calcPanel, BorderLayout.PAGE_START);

    final JButton calcButton = new JButton("Calculate");
    getContentPane().add(calcButton, BorderLayout.PAGE_END);
    calcButton.addActionListener(this);

    final JPanel calcPane2 = new JPanel(new GridLayout(2,1));
    calcPanel.add(calcPane2);

    topField = new JTextField("1", 2);
    calcPane2.add(topField);

    bottomField = new JTextField("3", 2);
    calcPane2.add(bottomField);

    final JLabel plusLabel =new JLabel("+");
    plusLabel.setFont(plusLabel.getFont().deriveFont(20.0f));
    calcPanel.add(plusLabel);

    final JPanel calcPane3 = new JPanel(new GridLayout(2,1));
    calcPanel.add(calcPane3);

    topField2 = new JTextField("2", 2);
    calcPane3.add(topField2);

    bottomField2 = new JTextField("5", 2);
    calcPane3.add(bottomField2);

    equalsLabel = new JLabel("= ");
    equalsLabel.setFont(equalsLabel.getFont().deriveFont(20.0f));
    calcPanel.add(equalsLabel);

    final JPanel calcPane4 = new JPanel(new GridLayout(2,1));
    calcPanel.add(calcPane4);

    equalsLabel1 = new JLabel("");
    equalsLabel1.setFont(equalsLabel1.getFont().deriveFont(18.0f));
    calcPane4.add(equalsLabel1);

    equalsLabel2 = new JLabel("");
    equalsLabel2.setFont(equalsLabel2.getFont().deriveFont(18.0f));
    calcPane4.add(equalsLabel2);
  }

  public void actionPerformed(ActionEvent e) 
  {
    int sum1 = Integer.parseInt(topField.getText())*Integer.parseInt(bottomField2.getText());
    int sum2 = Integer.parseInt(bottomField.getText())*Integer.parseInt(topField2.getText());
    int sum3 = Integer.parseInt(bottomField.getText())*Integer.parseInt(bottomField2.getText());
    int sumtotal = sum1 + sum2;
    String text1 = String.valueOf(sumtotal);
    String text2 = String.valueOf(sum3);
    equalsLabel1.setText(text1);
    equalsLabel2.setText(text2);
  }

  public static void main(String[] args) 
  {
    FracSimple app = new FracSimple();
    app.setVisible(true);
  }
}
