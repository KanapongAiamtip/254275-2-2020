import java.util.Scanner;
public class Lab3Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of assessments: ");
        int numberAssessments = sc.nextInt();
        float[] marks = new float[numberAssessments];

        for(int i = 1; i <= numberAssessments; i++)
        {
            System.out.print("Mark for assessment" +i+ ": ");
            marks[i-1] = sc.nextFloat();
        }
        float average = 0f;
        for(int i = 0; i < numberAssessments; i++)
        {
            average = average + marks[i];
        }
        average = average / numberAssessments;
        System.out.println("Your average mark is: " + average);
    }
}
