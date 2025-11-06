public class Sedan extends Cab1
{
    int distance;

    public Sedan(int distance)
    {
        super.price = 50;
        this.distance = distance;
    }

    public void fare()
    {
        System.out.println("......TOTAL FARE : " + this.price*this.distance);
    }
}
