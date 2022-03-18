package Week5_Generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args)
    {
        //Person Objects and Array
        Person p1 = new Person("John", 85);
        Person p2 = new Person("Mary", 35);
        Person p3 = new Person("Harold", 65);
        Person p4 = new Person("Wayne", 14);
        Person p5 = new Person("Ronald", 7);


        Person p6 = new Person("Juan", 100);
        Person p7 = new Person("Jose", 205);
        Person p8 = new Person("Jotaro", 300);
        Person p9 = new Person("Sasuke", 500);
        Person p10 = new Person("Naruto", 1000);


        Person[] personArray = {p1, p2, p3, p4, p5};
        Person[][] biggerPersonArray = {{p1, p2, p3, p4, p5}, {p6, p7, p8, p9, p10}};

        ArrayList personArrayList = new ArrayList();
        personArrayList.add(p9);
        personArrayList.add(p3);
        personArrayList.add(p7);
        personArrayList.add(p5);
        personArrayList.add(p1);
        personArrayList.add(p10);

        sort(personArrayList);
        System.out.println(personArrayList);
        System.out.println(max(personArray));
        System.out.println(max(biggerPersonArray));
        System.out.println("The person you're looking for is located at index " + binarySearch(personArray, p3) + " of the Person Array");

        //Car Objects and Array
        Car c1 = new Car("Toyota", "Corolla", 1990);
        Car c2 = new Car("Toyota", "Camry", 2000);
        Car c3 = new Car("Honda", "Civic", 2004);
        Car c4 = new Car("Kia", "Rio", 2013);
        Car c5 = new Car("Honda", "Civic", 2014);

        Car[] carArray = {c1, c2, c3, c4, c5};

        //System.out.println(max(carArray));

    }
    public static <E extends Comparable<E>> E max(E[] list) {
        E initialValue = list[0];

        for (E obj : list) {
            if (obj.compareTo(initialValue) > 0)
                initialValue = obj;
        }
        return initialValue;
    }

    public static <E extends Comparable<E>> E max(E [][] list)
    {
        E initialValue = list[0][0];

        for(E obj[] : list)
        {
            for(E obj2 : obj)
            {
                if(obj2.compareTo(initialValue) > 0)
                {
                    initialValue = obj2;
                }
            }
        }
        return initialValue;
    }

    public static <E extends Comparable<E>> void sort( ArrayList<E> list )
    {
        E minimum;
        int minimumIndex;

        for (int i = 0; i < list.size() - 1; i++) {
            // Find the minimum in the ArrayList
            minimum = list.get(i);
            minimumIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (minimum.compareTo(list.get(j)) > 0) {
                    minimum = list.get(j);
                    minimumIndex = j;
                }
            }

            // Swap list.get(i) with list.get(minimumIndex) if necessary;
            if (minimumIndex != i) {
                list.set(minimumIndex, list.get(i));
                list.set(i, minimum);
            }
        }
    }

    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high / 2);
            if (key.compareTo(list[mid]) < 0)
                high = mid - 1;
            else if (key.compareTo(list[mid]) == 0)
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1;
    }
}


