package Week5_Generics;

import java.util.ArrayList;
import java.util.Arrays;



public class OperateOnArray <E extends Comparable> {

    //data fields (instance variable)
    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

    //Constructor
    public OperateOnArray(ArrayList list)
    {
        this.list = list;
    }


    public <E extends Comparable<E>> boolean isSorted()
    {
        for (int i = 0; i < list.size() - 1; ++i) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0)
                return false;
        }
        return true;
    }

    //add element to the end of arrayList
    public void push( E obj ){
        list.add( obj );
    }

    public <E extends Comparable> int linearSearch(E key){
        for(int i = 0;i < list.size(); i++)
        {
            if(list.get(i).equals(key)){
                return i;
            }
        }
        return -1;
    }

    public  <E extends Comparable<E>> Integer binarySearch( E key)
    {
        if(!isSorted())
        {
            return null;
        }
        int low = 0;
        int high = list.size() - 1;

        while (high >= low) {
            int mid = (low + high / 2);
            if (key.compareTo((E) list.get(mid)) < 0)
                low = mid + 1;
            else if (key.compareTo((E) list.get(mid)) == 0)
                return mid;
            else
                high = mid - 1;
        }

        return -1;
    }
    public <E extends Comparable> E max()
    {
        if(list.size() == 0)
            return null;
        E max = (E) list.get(0);
        for(int i = 1; i < list.size(); i++)
        {
            if (list.get(i).compareTo(max) > 0)
            {
                max = (E) list.get(i);
            }
        }
        return max;

    }


}
