package Week5_Generics;

public class GenericStack<E> {

        //data fields (instance variables)
        private E[] arr;   //implement stack with array
        private int size;  //size of stack

        //constructor
        public GenericStack(){
            arr = (E[])(new Object[2] );  //declare array of generic objects E with
            initial size of 2
            size = 0;                     //no elements when stack is created
        }

        //return number of elements in stack
        public int getSize(){
            return size;
        }

        //return true if stack is empty, false otherwise
        public boolean isEmpty(){
        }

        //push element onto stack
        public void push( E obj ){
            /* if stack is not full
             * add obj to arr (use size as the index value)
             */


            /* else, if stack is full
             * resize stack
             * add obj to arr (use size as the index value)
             */

            //increase size of stack by one

            //System.out.println( "Array Length: " + arr.length );  //uncomment to check
            if array is resizing appropriately
        }

        //pop element from stack
        public E pop(){

            /* if stack is empty
             * print "Stack is empty. Can't pop from empty stack"
             * return null
             */

            /* assign last element of arr to temp (variable to be returned)
             * set last element of arr equal to null (pops element from stack)
             * decrease size of stack by 1
             * return temp
             */
        }

        //return element at end of stack
        public E peek(){

            /* if stack is empty
             * print "Stack is empty. Can't peek into empty stack"
             * return null
             */

            /* return last element in arr */
        }

        //return true if array is full, false otherwise
        //note: stack is never full
        private boolean isFull(){
            //compare size of stack to length of arr
        }

        //resize array if full
        private void resize(){
            /* newSize is 2 times current length of arr
             * set tempArr to arr
             */

            arr = (E[])(new Object[newSize] );

            // copy every element of tempArr into arr
            for( int i = 0; i < tempArr.length; i++ ){
            }
        }

        //return contents of stack in form of String
        @Override
        public String toString(){
            String str = "Stack: [";
            for( E obj : arr ){
                if( obj != null )      //comment to check if array is resizing
                    appropriately
                str += obj + ", ";
            }
            if( str.length() > 8 )
                str = str.substring(0, str.length()-2 );
            str += "]";
            return str;
        }
    }
}
