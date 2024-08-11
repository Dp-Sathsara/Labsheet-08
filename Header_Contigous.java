public class Header_Contigous {

    private int maxsize;
    private int position;
    private int[]listEntry;

    Header_Contigous(int size){
        maxsize=size;
        listEntry=new int[maxsize];
        position=-1;
    }
    boolean isListEmpty(){
        return (position==-1);
    }
    boolean isListFull(){
        return(position==maxsize-1);
    }
    int listSize(){
        return(position+1);
    }
    public void insertLast(int x){
        if(isListFull()){
            System.out.println("List is Already Full.");
        }else{
            listEntry[++position]=x;
        }
    }
    public void insertList(int p,int x){
        if(isListFull()){
            System.out.println("List is Already Full.");
        }else if(p<0||p>maxsize){
            System.out.println("Attempt to insert a position not in the list.");
        }else{
            for(int i=listSize();i>p;i--){
                listEntry[i]=listEntry[i-1];
                listEntry[p]=x;
                position++;
            }
        }
    }
    public void deleteList(int p){
        if(isListEmpty()){
            System.out.println("Attempt to delete an entry from an empty list");
        }else if(p<0||p>=listSize()){
            System.out.println("Attempt to delete a position not in the list");
        }else{
            int element;
            element=listEntry[p];
            for(int i=p;i<listSize()-1;i++){
                listEntry[i]=listEntry[i+1];
                position--;
            }
        } 
    }
    public void retriveList(int p){
        if(isListEmpty()){
            System.out.println("Attempt to delete an entry from an empty list");
        }else if(p<0||p>=listSize()){
            System.out.println("Attempt to delete a position not in the list");
        }else{
            System.out.println(listEntry[p]);
        }
    }
    public void replaceList(int p,int x){
        if(isListEmpty()){
            System.out.println("Attempt to delete an entry from an empty list");
        }else if(p<0||p>=listSize()){
            System.out.println("Attempt to delete a position not in the list");
        }else{
            listEntry[p]=x;
        }
    }
    public void traverseList(){
        for(int i=0;i<position+1;i++){
            System.out.println(listEntry[i]);
        }
    }
}