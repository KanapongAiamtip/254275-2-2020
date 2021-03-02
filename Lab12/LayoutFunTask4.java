import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class LayoutFunTask4 extends JFrame 
{

	public LayoutFunTask1() 
  {

		setTitle("Layout Fun");
		setSize(260, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        final JLabel label = new JLabel("Calculator", SwingConstants.CENTER); // Left , Center, right
        label.setFont(label.getFont().deriveFont(28.0f));
        getContentPane().add(label, BorderLayout.PAGE_START);   //North

        final JPanel buttonPanel = new JPanel();
        getContentPane().add(buttonPanel, BorderLayout.CENTER);

        buttonPanel.setLayout(new GridLayout(2,3));

		    final JButton button1 = new JButton("1");
        buttonPanel.add(button1);

        final JButton button2 = new JButton("2");
        buttonPanel.add(button2);

        final JButton button3 = new JButton("3");
        buttonPanel.add(button3);

        final JButton button4 = new JButton("4");
        buttonPanel.add(button4);

        final JButton button5 = new JButton("5");
        buttonPanel.add(button5);

        final JButton button6 = new JButton("6");
        buttonPanel.add(button6);
	}

	public static void main(String ... args) 
  {
		LayoutFunTask4 app = new LayoutFunTask4();
		app.setVisible(true);
	}
}
