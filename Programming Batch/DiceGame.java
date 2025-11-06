import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int dice;
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter the dice number: ");
            dice = s.nextInt();
        }
        GamePrice(dice);
        System.out.println("You won the cashprice worth is: " + GamePrice(dice));
    }



    public static int GamePrice(int dice){
        int cashprice = 0;
        switch (dice) {
        case 6: cashprice = 1000;
        case 5: cashprice = cashprice + 900;
        case 4: cashprice = cashprice + 800;
        case 3: cashprice = cashprice + 700;
        case 2: cashprice = cashprice + 600;
        case 1: cashprice = cashprice + 500;
        break;
        default: cashprice = -1;
        }
        return cashprice;
    }
}
