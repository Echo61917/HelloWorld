package Week5_Generics;

public class GenericStack<E>{
 //data fields (instance variable)
        private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

        //return size of arrayList
         public int getSize(){
             return list.size();
             }

         //return last element in arrayList
         public E peek(){
             return list.get( getSize() - 1 );
             }

        //add element to the end of arrayList
         public void push( E obj ){
             list.add( obj );
             }

         //remove last element of arrayList
         public E pop(){
             E obj = list.get( getSize() - 1 );
             list.remove( getSize() - 1 );
            return obj;
             }

         //return whether arrayList is empty or not
         public boolean isEmpty(){
             return list.isEmpty();
             }

         //return the contents of the arrayList as a String
         @Override
         public String toString(){
             return "stack: " + list.toString();
             }
}

