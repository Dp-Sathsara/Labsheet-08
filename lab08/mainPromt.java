package lab08;

public class mainPromt {
    public static void main(String[] args) {
        Product p1=new Product("P108", "Wireless Mouse\t", "Electronics", 2160,30);
        Product p2=new Product("P034", "Handbag\t\t", "Accessories ", 3450,5);
        Product p3=new Product("P078", "Phone cover\t", "Accessories ", 1750,26);
        Product p4=new Product("P105", "Bluetooth Speaker", "Electronics", 13780,5);
        Product p5=new Product("P003", "Ladies blouse\t", "Clothing ", 1650,18);
        Product p6=new Product("P053", "Shampoo\t\t", "Groceries", 2370,20);
        Product p7=new Product("P114", "Laptop\t\t", "Electronics", 250000,3);
        Product p8=new Product("P004", "Frock\t\t", "Clothing ", 4520,10);
        Product p9=new Product("P117", "Earphone\t", "Electronics", 7860,2);
        Product p10=new Product("P120", "Microwave oven\t", "Electronics", 56830,15);

        List l1=new List(10);
        l1.insertLast(p1);
        l1.insertLast(p2);
        l1.insertLast(p3);
        l1.insertLast(p4);
        l1.insertLast(p5);
        l1.insertLast(p6);
        l1.insertLast(p7);
        l1.insertLast(p8);
        l1.insertLast(p9);
        l1.insertLast(p10);
        System.out.println("Product ID\tProduct Name\t\t\tCategory\t\tUnitePrice(Rs.)\tQuantity Sold on Friday");
        l1.traverseList();
        System.out.println("");
        l1.displaysalesAmount();

    }
}
