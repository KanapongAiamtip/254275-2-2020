public class Lab2task4 
{
   public static void main(String[] args) 
   {
      String input = "This is the way it is ";
      int numOfVowels = countVowels(input);
      System.out.println("The String \"" + input + "\" has " + numOfVowels + " vowels");
   }// main

   private static int countVowels(String input) 
   {
      int count = 0;
      for (int i = 0; i < input.length(); i++) 
      {

         if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
               || input.charAt(i) == 'u' || input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I'
               || input.charAt(i) == 'O' || input.charAt(i) == 'U')
            count += 1;
      } // for
      return count;
   }// count
}// class
