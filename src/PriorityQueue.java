import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private List<Integer> queList;
    private int nItems;
    private int priority;

    //-------------------------------------------------------------
    public PriorityQueue(int maxSize) // constructor
    {
        queList = new ArrayList<>(maxSize);
        nItems = 0; // item number, eleman sayısı
    }
    //-------------------------------------------------------------
    public void insert(int np){
        queList.add(np);
        nItems++;
    } // end insert()

    //-------------------------------------------------------------
    public int remove(){
        int temp = queList.get(0);
        int index = 0;
        for(int i = 0; i < queList.size();i++){
            if(queList.get(i) > temp){
                temp = queList.get(i);
                index = i;
            }
        }
        queList.remove(index);
        nItems--;
        return temp;
    }
    //-------------------------------------------------------------
    public long peekMin() // peek at minimum item
    { return queList.get(nItems-1); }
    //-------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    { return (nItems==0); }
    //-------------------------------------------------------------
    public boolean isFull() // true if queue is full
    { return (nItems == maxSize); }

    // debug için yazdığımız method, sonra silicez
    public void print(){
        for(int np: queList){
            System.out.println(np);
        }
    }

    public int size(){
        return nItems;
    }



}
