public class Attraction extends Place 
{
    private int ticketPrice;
    private String attractionType;

    public Attraction(String name, String address, String province, String attractionType, int ticketPrice) 
    {

        super(name, address, province);
        this.ticketPrice = ticketPrice;
        this.attractionType = attractionType;
    }

    public int getEntryTicketPrice() 
    {
        return ticketPrice;
    }

    public String getAttractionType()
    {
        return attractionType;
    }

    public boolean isFreeEntry() 
    {
        if (ticketPrice == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isThemePark() 
    {
        if (attractionType.equals("Theme Park"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
