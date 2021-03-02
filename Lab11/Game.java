import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;

public class Game extends JFrame implements ActionListener
{
	final JLabel questionLabel;
	final JButton answer1 = new JButton();
	final JButton answer2 = new JButton();
	JLabel iplann = new JLabel();
	JLabel test = new JLabel();
	int score;
	//Reminder!!!!!!! : addActionListener() will be double if u dont do correctly!!!

	public Game()
	{
		setTitle("Countries and Cities Game");
		setSize(400, 200);		//(width,height)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());


			questionLabel = new JLabel();
			getContentPane().add(questionLabel);

			getContentPane().add(answer1);
			getContentPane().add(answer2);

			answer1.addActionListener(this);
			answer2.addActionListener(this);

        nextQuestion();
	}

	private void nextQuestion()
	{
    Question question = Question.randomQuestion();		//return new Question1("What is the capital city of "+country+"?", city, otherCity);
		questionLabel.setText(question.getText()); 				//Print Question

		Random soda = new Random();			//int index = random.nextInt(countries.length);
		int num = soda.nextInt(50);
		if (num %2 == 0)
		{
			answer1.setText(question.getCorrectAnswer());
			answer1.setActionCommand("correct");

			answer2.setText(question.getOtherAnswer());
			answer2.setActionCommand("incorrect");
		}
		else
		{
			answer1.setText(question.getOtherAnswer());
			answer1.setActionCommand("incorrect");

			answer2.setText(question.getCorrectAnswer());
			answer2.setActionCommand("correct");
		}
	}
		public void actionPerformed(ActionEvent bk)
		{
			JButton pp = (JButton) bk.getSource();			//Using By cast!!
			if (pp.getActionCommand().equals("correct"))
			{
				getContentPane().add(iplann);
				score++;
				iplann.setText("Correct! Score: " +score);
			}
			else
			{
				score = 0;
				getContentPane().add(iplann);
				iplann.setText("Sorry, you are wrong.");
			}
			nextQuestion();
		}
		public static void main(String ...args)
		{
			Game app = new Game();
			app.setVisible(true);
		}
}   // by P soda
