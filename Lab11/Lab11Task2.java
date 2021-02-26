import javax.swing.JFrame;
public class Lab11Task2 extends JFrame
{
  public Lab11Task2()
  {
    setTitle("My Application");
    setSize(300,200);
    setLocation(10,200);
  }

  public static void main(String[] args)
  {
        Lab11Task2 app = new Lab11Task2();
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Task3
  }

}
