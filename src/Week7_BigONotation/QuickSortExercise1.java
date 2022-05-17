package Week7_BigONotation;

import Week5_Generics.Car;
import Week5_Generics.SortByMakeComparator;
import Week5_Generics.SortByYearComparator;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSortExercise1 {
    public static void main(String[] args)
    {
        //{1, 2, 3, 6, 12, 23, 45, 47, 564}
        Integer[] arrInt = {12, 45, 564, 2, 23, 1, 47, 6, 3};
        String[] arrayOfNames = { "Carlos", "Octavio", "David", "Abraham", "Jasmine", "Jordan", "Daniel"};
        quickSort(arrInt);
        quickSort(arrayOfNames);
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrayOfNames));

        Car c1 = new Car("Toyota", "Corolla", 1990);
        Car c2 = new Car("Toyota", "Camry", 2000);
        Car c3 = new Car("Honda", "Civic", 2004);
        Car c4 = new Car("Kia", "Rio", 2013);
        Car c5 = new Car("Honda", "Civic", 2014);

        Car[] carArray = {c1, c2, c3, c4, c5};
        quickSort(carArray,new SortByYearComparator());

        System.out.println(Arrays.toString(carArray));
        quickSort(carArray,new SortByMakeComparator());
        System.out.println(Arrays.toString(carArray));

    }



    public static void quickSort( int[] list )   //helper method
    {
        quickSort( list, 0, list.length - 1);
    }

    public static void quickSort( int[] list, int first, int last )
    {
        if( last > first )
        {
            int pivotIndex = partition( list, first, last);    //get the pivotIndex
            quickSort( list, first, pivotIndex - 1 );          //quickSort first part of list
            quickSort( list, pivotIndex + 1, last );           //quickSort second part of list
        }
    }

    public static int partition( int[] list, int first, int last )
    {
        int pivot = list[first];   //set pivot to first element in array
        int low = first + 1;       //set low to second element in array
        int high = last;           //set high to last element in array

        while( high > low )
        {
            while( low <= high && list[low] <= pivot )   //traverse array to right until element is not less than pivot
                low++;

            while( low <= high && list[high] > pivot )   //traverse array to left until element is not greater than pivot
                high--;

            if( high > low )           //swap element at low and high
            {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while( high > first && list[high] >= pivot )
            high--;

        if( pivot > list[high] )
        {
            list[first] = list[high];     //move pivot element to intersecting location of high and low
            list[high] = pivot;
            return high;                  //return new pivot index
        }else
        {
            return first;  //return pivot index (unchanged)
        }
    }



    public static <E extends Comparable<E>> void quickSort(E[] list)
    {
        quickSort( list, 0, list.length - 1);
    }

    public static <E extends Comparable<E>> void quickSort( E[] list, int first, int last )
    {
        if( last > first )
        {
            int pivotIndex = partition( list, first, last);    //get the pivotIndex
            quickSort( list, first, pivotIndex - 1 );          //quickSort first part of list
            quickSort( list, pivotIndex + 1, last );           //quickSort second part of list
        }
    }

    public static<E extends Comparable<E>> int partition(E[] list, int first, int last )
    {
        E pivot = list[first];   //set pivot to first element in array
        int low = first + 1;       //set low to second element in array
        int high = last;           //set high to last element in array

        while( high > low )
        {
            while( low <= high && list[low].compareTo(pivot) <= 0 )//traverse array to right until element is not less than pivot
                low++;

            while( low <= high && list[high].compareTo(pivot) > 0)   //traverse array to left until element is not greater than pivot
                high--;

            if( high > low )           //swap element at low and high
                {
                    E temp = list[high];
                    list[high] = list[low];
                    list[low] = temp;
                }
        }

        while( high > first && list[high].compareTo(pivot) >= 0 )
            high--;

        if( pivot.compareTo(list[high]) > 0 )
        {
            list[first] = list[high];     //move pivot element to intersecting location of high and low
            list[high] = pivot;
            return high;                  //return new pivot index
        }
        else
        {
            return first;  //return pivot index (unchanged)
        }
    }




    public static <E> void quickSort(E[] list, Comparator<? super E> comparator)
    {
            quickSort( list, 0, list.length - 1, comparator);
    }

    public static <E> void quickSort( E[] list, int first, int last, Comparator<? super E> comparator)
    {
        if( last > first )
        {
            int pivotIndex = partition( list, first, last, comparator);    //get the pivotIndex
            quickSort( list, first, pivotIndex - 1, comparator);          //quickSort first part of list
            quickSort( list, pivotIndex + 1, last, comparator);           //quickSort second part of list
        }
    }

    public static<E> int partition(E[] list, int first, int last, Comparator<? super E> comparator )
    {
        E pivot = list[first];   //set pivot to first element in array
        int low = first + 1;       //set low to second element in array
        int high = last;           //set high to last element in array

        while( high > low )
        {
                while(low <= high && comparator.compare(list[low], pivot) <= 0)//traverse array to right until element is not less than pivot
                low++;

            while(low <= high && comparator.compare(list[high], pivot) > 0) //traverse array to left until element is not greater than pivot
                high--;

            if( high > low )           //swap element at low and high
                 {
                     E temp = list[high];
                    list[high] = list[low];
                    list[low] = temp;
                 }
        }

        while(high > first && comparator.compare(list[high], pivot) >= 0)
            high--;

        if(comparator.compare(pivot, list[high]) > 0)
        {
            list[first] = list[high];     //move pivot element to intersecting location of high and low
            list[high] = pivot;
            return high;                  //return new pivot index
        }
        else
        {
            return first;  //return pivot index (unchanged)
        }
    }
}
