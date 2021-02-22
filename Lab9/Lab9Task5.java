 public class Lab9Task5 
 {

    public static void main(String[] args) 
    {
        Attraction wat = new Attraction("Wat Phra Kaew", "Sanam Luang", "Bangkok", "Temple", 200);
        Attraction dream = new Attraction("Dreamworld", "Thanyaburi", "Pathum Thani", "Theme Park", 1500);
        Attraction ctw = new Attraction("CentralWorld", "Siam", "Bangkok", "Shopping Centre", 0);

        Attraction[] attractions = { wat, dream, ctw };

        for (int i = 0; i < attractions.length; i++) 
        {
            Attraction a = attractions[i];
            System.out.print(a.getName() + " is a " + a.getAttractionType());
            if (a.isFreeEntry()) 
            {
                System.out.println(" and is free entry!");
            }
			      else 
            {
                System.out.println(" and costs " + a.getEntryTicketPrice() + " baht for entry.");
            }
        }

    }

}
