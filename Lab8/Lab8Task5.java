public class Lab8Task5 
{
    public static void main(String[] args) 
    {
        Cylinder cy = new Cylinder("while", 4, 5);
        System.out.println(cy.toString());
        System.out.println("Radius = " + cy.getRadius());
        System.out.println("Height = " + cy.getHeight());
    }
}
