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
}
