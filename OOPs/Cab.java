import java.util.Scanner;

public class Cab {

    public int fare;

    Cab(int fare){
        this.fare = fare;
    }

    public int CalculateFare(Cab c){
        int totalFare = 0;
        if(c instanceof Mini){
            Mini mini = (Mini) c;
            totalFare = mini.getDistance() * 10;
            mini.DisplayDetails();
            return totalFare;
        }
        else if(c instanceof Sedan){
            Sedan sedan = (Sedan) c;
            totalFare = sedan.getDistance() * 15;
            sedan.DisplayDetails();
            return totalFare;
        }
        else if(c instanceof Suv){
            Suv suv = (Suv) c;
            totalFare = suv.getDistance() * 20;
            suv.DisplayDetails();
            return totalFare;
        }
        return totalFare;
    } 

    void booking(){
        System.out.println("Cab Booked Successfully");
    }
}

class Mini extends Cab{
    private int distance;

    Mini(int fare, int distance) {
        super(fare);
        this.distance = distance;
    }

    int getDistance(){
        return distance;
    }
    void DisplayDetails(){
        System.out.println("Mini cab booked");
        System.out.println("Fare per/km: 10Rs");
        System.out.println("Total distance: "+ this.distance);
    }
}

class Sedan extends Cab{
    private int distance;

    Sedan(int fare, int distance) {
        super(fare);
        this.distance = distance;
    }

    int getDistance(){
        return distance;
    }
    void DisplayDetails(){
        System.out.println("Sedan cab booked");
        System.out.println("Fare per/km: 15Rs");
        System.out.println("Total distance: "+ this.distance);
    }
}

class Suv extends Cab{
    private int distance;

    Suv(int fare, int distance) {
        super(fare);
        this.distance = distance;
    }

    int getDistance(){
        return distance;
    }
    void DisplayDetails(){
        System.out.println("SUV cab booked");
        System.out.println("Fare per/km: 20Rs");
        System.out.println("Total distance: "+ this.distance);
    }
}
class Uber{
    private Cab cab;

    Uber(Cab cab){
        this.cab = cab;
    }

    void DisplayCab(){
        System.out.println("WELCOME TO UBER! SELECT CAR ACCORDING TO YOU");
    }
}

class UberConnDriver{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome");

        Uber uber = new Uber(null);
        Cab cab;
        int distance;

        uber.DisplayCab();

        
        System.out.println("Enter your Choice 1: MINI, 2: SEDAN, 3: SUV");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter the Distance: ");
            distance = s.nextInt();
            cab = new Mini(0, distance);
            int minifare = cab.CalculateFare(cab);
            System.out.println("Total Fare: "+ minifare);
            cab.booking();
                break;

            case 2:
            System.out.println("Enter the Distance: ");
            distance = s.nextInt();
            cab = new Sedan(0, distance);
            int sedanfare = cab.CalculateFare(cab);
            System.out.println("Total Fare: "+ sedanfare);
            cab.booking();
                break;

            case 3:
            System.out.println("Enter the Distance: ");
            distance = s.nextInt();
            cab = new Suv(0, distance);
            int suvfare = cab.CalculateFare(cab);
            System.out.println("Total Fare: "+ suvfare);
            cab.booking();
                break;
            default:
            System.out.println("INVALID INPUT!, Enter from 1 to 3 choices only.");
                break;
        }
        s.close();
    }
}