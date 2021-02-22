public class Restaurant extends Place 
{
    public String foodType;

    public Restaurant(String name, String address, String province, String foodType) {
        super(name, address, province);
        this.foodType = foodType;
    }

    public String getFoodType() 
    {
        return foodType;
    }

    public boolean isThaiFood() 
    {
        if (foodType.equals("Thai")) 
        {
            return true;
        }
        return false;
    }

    public boolean hasSameFoodType(Restaurant r2) 
    {
        if (foodType.equals(r2.foodType)) 
        {
            return true;
        }
        return false;
    }
}
