import java.util.LinkedList;

public class LlistEg {
    public static void main(String[] args) {
        Product p1 = new Product("Bottle", 120, 10);
        Product p2 = new Product("Mouse", 500, 6);
        Product p3 = new Product("Pen", 5, 50);

        LinkedList<Product> pList = new LinkedList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);

        Product p4 = new Product("Book", 50, 6);
        pList.add(1, p4);

        for (Product p : pList) {
            System.out.println(p.item + " " + p.price + " " + p.qty);
        }
    }
}

class Product {
    double price;
    int qty;
    String item;

    public Product(String item, double price, int qty) {
        this.item = item;
        this.price = price;
        this.qty = qty;
    }
}
