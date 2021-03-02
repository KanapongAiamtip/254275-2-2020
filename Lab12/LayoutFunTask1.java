import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
public class LayoutFunTask1 extends JFrame 
{

	public LayoutFunTask1() 
  {

		setTitle("Layout Fun");
		setSize(400, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Flow layout for a row of components
		setLayout(new FlowLayout());

		final JButton button1 = new JButton("1");
		getContentPane().add(button1);

		final JButton button2 = new JButton("2");
		getContentPane().add(button2);

		final JButton button3 = new JButton("3");
		getContentPane().add(button3);

		final JButton button4 = new JButton("4");
		getContentPane().add(button4);

		final JButton button5 = new JButton("5");
		getContentPane().add(button5);
	}

	public static void main(String ... args) 
  {
		LayoutFunTask1 app = new LayoutFunTask1();
		app.setVisible(true);
	}
}
