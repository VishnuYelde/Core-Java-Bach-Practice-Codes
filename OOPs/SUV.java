public class SUV extends Cab1
{
    int distance;

    public SUV(int distance)
    {
        super(50);
        this.distance = distance;
    }
    
    public void fare()
    {
        System.out.println(".....TOTAL FARE : Rs. " + this.price*this.distance);
    }
}
