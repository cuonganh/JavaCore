public class Animal
{
    public int popularity;
    public String favouriteFood;

    public void thoughts()
    {
        System.out.println("I am an Animal, I don't know what I want to eat.");
    }

    public void talk()
    {
        System.out.print("Hello! ");
        thoughts();
    }
}
