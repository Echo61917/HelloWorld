package Week6_DataStructures;
import java.lang.IndexOutOfBoundsException;
import java.util.Iterator;

//A data structure is a class that lets you organize data
public class List <E> implements Iterable<E>{

        //Implement the list using an array
        private E[] arr;
        private int size;
        //Zero argument constructor
        public List()
        {
            this.arr = (E[]) new Object[10];
            this.size = 0;
        }

        //Multiple argument constructor
        public List(int initialSize)
        {
            this.arr = (E[]) new Object[initialSize];
            this.size = 0;
        }


        public int size()
        {
            return this.size();
        }

        public E get(int index) {return arr[index];}


        public void add(E obj)
        {
            if(this.size == arr.length)
            {
                resize();
            }
           this.arr[this.size] = obj;
           this.size++;
        }

        //{3, 9, 15, null}, size = 3, add(1, 7)
        //{3, 7, 9, 15}, size = 4
        public void add(int index, E obj)
        {
            if(index > this.size || index < 0)
            {

                throw new IndexOutOfBoundsException();
            }
            if(this.size == arr.length)
            {
                resize();
            }
            for(int i = size; i > index; i--) //This will shift elements one space to the right
            {
                arr[i] = arr[i - 1];
            }
            arr[index] = obj;
            this.size++;


//            E temp = arr[index];
//            this.arr[index] = obj;
//
////            E temp2 = arr[index + 1];
//            this.arr[index + 1] = temp;
////
////            E temp3 = arr[index + 2];
////            this.arr[index + 2] = temp2;
//            int j = 0;
//            for(int i = index; i < arr.length; i++)
//            {
//                if(arr[index + j] != null) {
//
//
//                    E tempVal = arr[index + j];
//                    this.arr[index] = obj;
//                    E tempVal2 = arr[index + j + 1];
//                    arr[index + j] = arr[index + j];
//                    j++;
//                }
//                else
//                    break;
//            }
//            this.size++;


        }
        private void resize()
        {
            //store elements in arr in temporary variable
            E[] temp = this.arr;
            //reinitialize arr to a new array with more space
            this.arr = (E[]) new Object[2 * arr.length];
            //Copy all elements back into arr
            for(int i = 0; i < temp.length; i++)
            {
                this.arr[i] = temp[i];
            }

        }

        @Override
        public String toString()
        {
            String str = "List: [";
            for(E obj : arr) {
                if (obj != null) {
                    str += obj + ", ";
                }
            }
                if(str.length() > 8)
                    str = str.substring(0, str.length() - 2);
                str += "]";
                return str;
        }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(this);
    }
}

