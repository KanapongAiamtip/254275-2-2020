import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Color;



public class LayoutFunTask5 extends JFrame
{
    final JTextField topField;
    final JTextField bottomField;
    final JLabel equalsLabel;

    public LayoutFunTask5()
    {
        setTitle("Layout Fun");
        setSize(280, 100);
        setDefaultCloseOperation(3);
        setLayout(new BorderLayout());

        final JPanel calcPanel = new JPanel(new FlowLayout());
        calcPanel.setBackground(Color.PINK);
        getContentPane().add(calcPanel, BorderLayout.CENTER);

        final JButton calcButton = new JButton("Convert");
        getContentPane().add(calcButton, BorderLayout.PAGE_END);

        topField = new JTextField("1",2);           //TextField("Text", width of box)
        calcPanel.add(topField);

        final JLabel plusLabel = new JLabel("+");
        plusLabel.setFont(plusLabel.getFont().deriveFont(20.0f));
        calcPanel.add(plusLabel);

        bottomField = new JTextField("3", 2);
        calcPanel.add(bottomField);

        equalsLabel = new JLabel("= ?");
        equalsLabel.setFont(equalsLabel.getFont().deriveFont(20.0f));
        calcPanel.add(equalsLabel);
    }
    public static void main(String ... args)
    {
        LayoutFunTask5 app = new LayoutFunTask5();
        app.setVisible(true);
    }
}
