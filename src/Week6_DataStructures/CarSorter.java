package Week6_DataStructures;

import Week5_Generics.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CarSorter {
    public static void main(String[] args) {
        ArrayList<Car> carInventory = new ArrayList<>();

        Car car1 = new Car("Mercedes-Benz", "A-Class", 2021);
        Car car2 = new Car("Nissan", "Altima", 2019);
        Car car3 = new Car("Nissan", "Atlas", 2015);
        Car car4 = new Car("Subaru", "Ascent", 2020);
        Car car5 = new Car("Lincoln", "Aviator", 2011);
        Car car6 = new Car("Bentley", "Bentayga", 2014);
        Car car7 = new Car("Volkswagen", "Atlas", 2013);
        Car car8 = new Car("Lamborghini", "Aventador", 2020);
        Car car9 = new Car("Chevrolet", "Blazer", 2020);
        Car car10 = new Car("Ford", "Bronco", 2010);

        carInventory.add(car1);
        carInventory.add(car2);
        carInventory.add(car3);
        carInventory.add(car4);
        carInventory.add(car5);
        carInventory.add(car6);
        carInventory.add(car7);
        carInventory.add(car8);
        carInventory.add(car9);
        carInventory.add(car10);

       Collections.sort(carInventory, new MakeComparator());

        for(Car c : carInventory)
        {
            System.out.println(c);
        }
        Collections.sort(carInventory, new ModelComparator());

        for(Car c : carInventory)
        {
            System.out.println(c);
        }
        Collections.sort(carInventory, new YearComparatorAscending());
        for(Car c : carInventory)
        {
            System.out.println(c);
        }

        Collections.sort(carInventory, new YearComparatorDescending());
        for(Car c : carInventory)
        {
            System.out.println(c);
        }
    }

    static class MakeComparator implements Comparator<Car>
    {
        @Override
        public int compare(Car c1, Car c2)
        {
            return c1.getMake().compareTo(c2.getMake());
        }
    }

    static class ModelComparator implements Comparator<Car>
    {
        @Override
        public int compare(Car c1, Car c2)
        {
            return c1.getModel().compareTo(c2.getModel());
        }
    }

    static class YearComparatorAscending implements Comparator<Car>
    {
        @Override
        public int compare(Car c1, Car c2)
        {
            return c1.getYear() - c2.getYear();
        }

    }
    static class YearComparatorDescending implements Comparator<Car>
    {
        @Override
        public int compare(Car c1, Car c2)
        {
            return c2.getYear() - c1.getYear();
        }

    }
}
