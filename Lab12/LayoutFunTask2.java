import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class LayoutFunTask2 extends JFrame 
{

    public LayoutFunTask2() 
    {

        setTitle("Layout Fun");
        setSize(400, 340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Flow layout for a row of components
        setLayout(new BorderLayout());


        final JButton button1 = new JButton("1");
        getContentPane().add(button1, BorderLayout.PAGE_START);

        final JButton button2 = new JButton("2");
        getContentPane().add(button2, BorderLayout.CENTER);
        final JButton button3 = new JButton("3");
        getContentPane().add(button3, BorderLayout.LINE_START);

        final JButton button4 = new JButton("4");
        getContentPane().add(button4, BorderLayout.LINE_END);

        final JButton button5 = new JButton("5");
        getContentPane().add(button5, BorderLayout.PAGE_END);
    }

    public static void main(String ... args) 
    {
        LayoutFunTask2 app = new LayoutFunTask2();
        app.setVisible(true);
    }
}
