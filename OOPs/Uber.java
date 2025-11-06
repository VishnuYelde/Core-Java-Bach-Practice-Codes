public class Uber 
{
    Cab1 cab;

    public Uber(){
    }

    public Uber(Cab1 cab){
        this.cab = cab;
    }
    
    public static void displayDetails(Cab1 cab){

        //JDK-17 onwards
        if (cab instanceof Mini mini){
            System.out.println("\tPRICE : " + mini.price + " per km.");
            System.out.println("\tDISTANCE : " + mini.distance + " km");
            mini.fare();
        }
        else if (cab instanceof Sedan sedan){
            System.out.println("\tPRICE : " + sedan.price + " per km.");
            System.out.println("\tDISTANCE : " + sedan.distance + " km");
            sedan.fare();
        }
        else if (cab instanceof SUV suv){
            System.out.println("\tPRICE : " + suv.price + " per km.");
            System.out.println("\tDISTANCE : " + suv.distance + " km");
            suv.fare();
        }
            

        // if (cab instanceof Mini mini)
        // { //Downcasting
        //Downcasting
        //     System.out.println("\tPRICE : " + mini.price + " per km.");
        //     System.out.println("\tDISTANCE : " + mini.distance + " km");
        //     mini.fare();
        //     cab.booking();
        // }
        // else if (cab instanceof Sedan)
        // {
        //     Sedan sedan = (Sedan) cab; //Downcasting
        //     System.out.println("\tPRICE : " + sedan.price + " per km.");
        //     System.out.println("\tDISTANCE : " + sedan.distance + " km");
        //     sedan.fare();
        //     cab.booking();
        // }
        // else if (cab instanceof SUV)
        // {
        //     SUV suv = (SUV) cab; //Downcasting
        //     System.out.println("\tPRICE : " + suv.price + " per km.");
        //     System.out.println("\tDISTANCE : " + suv.distance + " km");
        //     suv.fare();
        //     cab.booking();
        // }

    }
}
 