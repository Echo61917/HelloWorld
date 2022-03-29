package Week6_DataStructures;

//A data structure is a class that lets you organize data
public class List <E>{

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

        public void add(E obj)
        {
            if(this.size == arr.length)
            {
                resize();
            }
           this.arr[this.size] = obj;
           this.size++;
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
    }

