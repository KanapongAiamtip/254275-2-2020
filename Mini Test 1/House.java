  public class House 
  {
    private int bedrooms;
    private int toilets;

    public House(int bedrooms, int toilets) 
    {
        this.bedrooms = bedrooms;
        this.toilets = toilets;
    }

    public int getBedrooms() 
    {
      return bedrooms;
    }

    public int getToilets() 
    {
      return toilets;
    }

    public int getTotal() 
    {
      return bedrooms + toilets + 2;
    }
}
