public class Header_Contigous {

    private int maxsize;
    private int position;
    private int[]listEntry;

    Header_Contigous(int size){
        maxsize=size;
        listEntry=new int[maxsize];
        position=-1;
    }
    
}