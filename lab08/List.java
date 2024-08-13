package lab08;

public class List {
    private int maxsize;
    private int position;
    private Product[]entry;

    public List(int size){
        maxsize=size;
        position=-1;
        entry=new Product[maxsize];
    }
    boolean isEmpty(){
        return(position==-1);
    }
    boolean isFull(){
        return(position==maxsize-1);
    }
    public int listSize(){
        return(position+1);
    }
    public void insertLast(Product x){
        if (isFull()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }else{
            entry[++position]=x;
        }
    }
    public void insertList(int p,Product x){
        if (isFull()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }else if (p<0||p>listSize()) {
            System.out.println("Attempt to delete a position not in the list");
        }else{
            for(int i=listSize();i>p;i--){
                entry[i]=entry[i-1];
                entry[p]=x;
                position++;
            }
        }
    }
    public void deleteList(int p){
        if (isEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }else if (p<0||p>listSize()) {
            System.out.println("Attempt to delete a position not in the list");
        }else{
            for(int i=p;i<listSize()-1;i++){
                entry[i]=entry[i-1];
                position--;
            }
        }
    }
    public void retriveList(int p){
        if (isEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }else if(p<0||p>listSize()){
            System.out.println("Attempt to delete a position not in the list");
        }else{
            System.out.println(entry[p]);
        }
    }
    public void replaceList(int p,Product x){
        if (isEmpty()) {
            System.out.println("Attempt to delete an entry from an empty list");
        }else if(p<0||p>listSize()){
            System.out.println("Attempt to delete a position not in the list");
        }else{
            entry[p]=x;
        }
    }
    public void traverseList(){
        for (int i = 0; i < position+1; i++) {
            System.out.println(entry[i]);
        }
    }
    public double calculatesalesAmount(Product x){
        return(x.unitePrice*x.QSOFriday);
    }
    public void displaysalesAmount(){
        System.out.println("Product ID\tSales Amount(Rs.)");
        for (int i = 0; i < listSize(); i++) {
            double saleAmount=calculatesalesAmount(entry[i]);
            System.out.println(entry[i].productID+"\t\t"+saleAmount);
        }
    }
    public void sortBysalesAmount(){
        for (int i = 0; i < listSize()-1; i++) {
            for (int j = i+1; j < listSize(); j++) {
                if (calculatesalesAmount(entry[i])<calculatesalesAmount(entry[j])) {
                    Product temp=entry[i];
                    entry[i]=entry[j];
                    entry[j]=temp;
                }
            }
        }
    }
    public void correctQuantity(String x,int y){
        for (int i = 0; i < listSize(); i++) {
            if (entry[i].productName.trim().equals(x)) {
                entry[i].QSOFriday=y;
            }
        }
    }
    public void displaysalesAbove(double amount){
        System.out.println("Products with Sales Amount above Rs.: " + amount + "/=");
        for (int i = 0; i < listSize(); i++) {
            double saleAmount=calculatesalesAmount(entry[i]);
            if (saleAmount>amount) {
                System.out.println(entry[i]);
            }
        }
    }
    /*public void calculateSales(String x){
        double total=0;
        for (int i = 0; i < listSize(); i++) {
            if (entry[i].category.trim().equals(x)) {
                total+=calculatesalesAmount(entry[i]);  
            }
        }
        System.out.println("Total Sales Amount for "+x+" Category: Rs. "+total+"/=");
    }*/
    public double calculateElectonicSales(){
        double total=0;
        for (int i = 0; i < listSize(); i++) {
            if (entry[i].category.trim().equals("Electronics")) {
                total+=calculatesalesAmount(entry[i]);  
            }
        }
        return total;
    }
    public double calculatetotalsales(){
        double Total=0;
        for (int i = 0; i < listSize(); i++) {
            Total+=calculatesalesAmount(entry[i]);
        }
        return Total;
    }
    public double calculateElectronicsalespercentage(){
        return(calculateElectonicSales()/calculatetotalsales())*100;
    }
}
