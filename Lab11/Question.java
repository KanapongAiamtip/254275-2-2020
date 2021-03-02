import java.util.Random;
public class Question
{

	private String text;
	private String correctAnswer;
	private String otherAnswer;

	final static String[] countries = { "England", "France", "Germany", "Italy" };
	final static String[] cities = { "London", "Paris", "Berlin", "Rome" };

	public Question(String text, String correctAnswer, String otherAnswer)
	{
		this.text = text;
		this.correctAnswer = correctAnswer;
		this.otherAnswer = otherAnswer;
	}

	public String getText()
	{
		return text;
	}

	public String getCorrectAnswer()
	{
		return correctAnswer;
	}

	public String getOtherAnswer()
	{
		return otherAnswer;
	}

	public static Question randomQuestion()
	{

		Random random = new Random();
    	int index = random.nextInt(countries.length);
    	String country = countries[index];
    	String city = cities[index];

    	String otherCity;
    	do
			{
    		otherCity = cities[random.nextInt(cities.length)];
    	}
			while (otherCity.equals(city));

    	return new Question("What is the capital city of "+country+"?", city, otherCity);
	}
}
