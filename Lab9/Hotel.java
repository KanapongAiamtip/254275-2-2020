public class Hotel extends Place 
{

    private int roomPrice;

    public Hotel(String name, String address, String province, int roomPrice) 
    {

        super(name, address, province);
        this.roomPrice = roomPrice;
    }

    public int calculatePrice(int a) 
    {
        return a * roomPrice;
    }

    public int calculatePrice(int a, int b) 
    {
        return a * b * roomPrice;
    }
}
