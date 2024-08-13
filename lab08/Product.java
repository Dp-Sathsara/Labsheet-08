package lab08;

public class Product {
    public String productID;
    public String productName;
    public String category;
    public double unitePrice;
    public int QSOFriday;

    public Product(String productID, String productName, String category, double unitePrice, int QSOFriday) {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.unitePrice = unitePrice;
        this.QSOFriday = QSOFriday;
    }
    public String toString(){
        return(productID+"\t\t"+productName+"\t\t"+category+"\t\t"+unitePrice+"\t\t"+QSOFriday);
    }
    
    
}
