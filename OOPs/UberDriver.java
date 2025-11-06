import java.util.Scanner;

public class UberDriver
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        Uber uber = new Uber();

        System.out.println("\n-----------Welcome to the Uber-----------\n");

        char choice2 = '\u0000';
        do
        {
            System.out.println("PRESS 1 FOR :  SUV");
            System.out.println("PRESS 2 FOR :  SEDAN");
            System.out.println("PRESS 3 FOR :  MINI");

            System.out.print("\n\tENTER YOUR CHOICE : ");
            int choice1 = s.nextInt();

            

            switch (choice1)
            {
                case 1:{
                            System.out.print("ENTER DISTANCE : ");
                            uber.cab =new SUV(s.nextInt()); /*UPCASTED SCENARIO*/
                            Uber.displayDetails(uber.cab);

                            break;
                        }
                case 2:{
                            System.out.print("ENTER DISTANCE : ");
                            uber.cab =new Sedan(s.nextInt());
                            Uber.displayDetails(uber.cab);

                            break;
                        }
                case 3:{
                            System.out.print("ENTER DISTANCE : ");
                            uber.cab =new Mini(s.nextInt());
                            Uber.displayDetails(uber.cab);

                            break;
                        }
                default:{
                            System.out.println("\n.......INVALID INPUT.......\n");
                            
                        }
                        
            }
            System.out.print("\tDO YOU WANT TO CONTINUE (Y/N) : ");
            choice2 = s.next().charAt(0);
        }while (choice2 == 'y' || choice2 == 'Y');
        s.close();
    }
}
