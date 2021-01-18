import java.util.Scanner;
public class Lab2Task7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score : ");
        int score = sc.nextInt();
        String score1 = check(score);
        System.out.print(score1);
    }
    private static String check(int y) 
    {
        String grade1 = "Grades: 80+ 'A'";
        String grade2 = "Grades: 75-79+ 'B+'";
        String grade3 = "Grades: 70-74+ 'B'";
        String grade4 = "Grades: 65-69 'C+'";
        String grade5 = "Grades: 60-64 'C'";
        String grade6 = "Grades: 55-59 'D+'";
        String grade7 = "Grades: 50-54 'D'";
        String grade8 = "Grades: <50 'F'";
       if (y >= 80 && y <= 100)
       {
           return grade1;
       }
       else if (y >= 75 && y <= 79)
       {
           return grade2;
       }
       else if (y >= 70 && y <= 74)
       {
           return grade3;
       }
       else if (y >= 65 && y <= 69)
       {
           return grade4;
       }
       else if (y >= 60 && y <= 64)
       {
           return grade5;
       }
       else if (y >= 55 && y <= 59)
       {
           return grade6;
       }
       else if (y >= 50 && y <= 54)
       {
           return grade7;
       }
       else if (y < 50 && y >= 0)
       {
           return grade8;
       }
       else
       {
           return "wrong score";
       }
    }
}
