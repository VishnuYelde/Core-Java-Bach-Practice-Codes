import java.util.*;

public class Program1tcs {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the Income: ");
            float income = s.nextFloat();


            LinkedHashMap<String, Float> map = new LinkedHashMap<>();
            float sumexp = 0;
            String expense = "";
            do{

                System.out.println("Enter Expense type or done: ");
                expense = s.next();
                if (expense.equals("done")) {
                    break;
                }

                System.out.println("Enter the Price: ");
                float price = s.nextFloat(); 
                
                map.put(expense, price);
                
                sumexp = sumexp + price;

                System.out.println("");
            }while(true);

            float savings = income - sumexp;
            System.out.println("Summary of Expenses:");
            System.out.println("Total Income: " + income + "$");
            System.out.println("Total Expenses: " + sumexp + "$");
            System.out.println("Total Savings: " + savings + "$");

            System.out.println("Analysis:");
            System.out.println("Expense and Price:");

            for(Map.Entry<String, Float> entry : map.entrySet())
            {
                System.out.println(" - " + entry.getKey() + ":" + entry.getValue() + "$");
            }
        }
    }
}
