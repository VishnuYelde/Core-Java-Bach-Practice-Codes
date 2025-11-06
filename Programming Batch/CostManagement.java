import java.util.Scanner;

public class CostManagement {
    public static void main(String[] args) {
        int weight;
        char zone;
        try(Scanner s = new Scanner(System.in)){
            System.out.println("Enter the weight of the package: ");
            weight = s.nextInt();
            System.out.println("Enter the Zone: ");
            zone = s.next().charAt(0);
        }

        ShippingCost(zone, weight);
        System.out.println("The shipping cost is: " + CostManagement.ShippingCost(zone, weight));
    }

    public static double zoneCalculator(char zone){
        return switch (zone)
        {
            case 'A' -> 5.0;
            case 'B' -> 7.0;
            case 'C' -> 10.0;
            default -> 0.0;
        };
    }

    public static double ShippingCost(char zone, int weight){
        double total_cost = 0;
        if (weight<=10){
            total_cost = zoneCalculator(zone) * weight * 0.90;
        }
        else if (weight>10 && weight <=20) 
        {
            total_cost = zoneCalculator(zone) * weight * 0.85;
        }
        else if (weight>20)
        {
            total_cost = zoneCalculator(zone) * weight * 0.80;
        }
        return total_cost;
    }
}
