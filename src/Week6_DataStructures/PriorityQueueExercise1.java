package Week6_DataStructures;

import Week5_Generics.Car;

import java.util.PriorityQueue;

public class PriorityQueueExercise1 {
    public static void main(String[] args) {

        PriorityQueue<Car> carList = new PriorityQueue<>();

        Car car1 = new Car("Honda", "Civic", 2004);
        Car car2 = new Car("Ford", "Ranger", 1997);
        Car car3 = new Car("Kia", "Rio", 2013);
        Car car4 = new Car("Rolls Royce", "Wraith", 2022);
        Car car5 = new Car("Tesla", "Y", 2022);

        carList.offer(car1);
        carList.offer(car2);
        carList.offer(car3);
        carList.offer(car4);
        carList.offer(car5);

        while(carList.size() > 0)
        {
            System.out.println(carList.remove() + " ");
        }
    }
}
