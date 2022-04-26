package Week6_DataStructures;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueExercise3 {
    public static void main(String[] args)
    {
    PriorityQueue<Task> ToDoList = new PriorityQueue<>();

    Scanner progamState = new Scanner(System.in);
    String programCondition = "";

    Task task1 = new Task("Take out the trash.", 1);
    Task task2 = new Task("Wash and Dry dishes.", 2);
    Task task3 = new Task("Clean counters.", 3);
    Task task4 = new Task("Clean stove.", 4);
    Task task5 = new Task("Sweep kitchen floor.", 5);
    Task task6 = new Task("Mop kitchen floor.", 6);
    Task task7 = new Task("Dust coffee table and TV stand.", 7);
    Task task8 = new Task("Take shoes out of living room.", 8);
    Task task9 = new Task("Vacuum the living room carpet.", 9);

    ToDoList.offer(task1);
    ToDoList.offer(task2);
    ToDoList.offer(task3);
    ToDoList.offer(task4);
    ToDoList.offer(task5);
    ToDoList.offer(task6);
    ToDoList.offer(task7);
    ToDoList.offer(task8);
    ToDoList.offer(task9);

    System.out.println("Please enter next in the text box, to receive the next task" + "\nEnter quit to exit the program");
    System.out.println("To Do List: ");
    System.out.println(ToDoList.remove());
    while(ToDoList.size() > 0 || !programCondition.equalsIgnoreCase("quit"))
    {
        programCondition = progamState.nextLine();

        if(programCondition.equalsIgnoreCase("next"))
        {
            System.out.println(ToDoList.remove());
        }
        else if(programCondition.equalsIgnoreCase("quit"))
        {
            System.out.println("Program terminated");
            break;
        }
        else if(ToDoList.size() < 0 || programCondition.equalsIgnoreCase("next"))
        {
            System.out.println("All tasks have been printed.");
            break;
        }
    }
//        if(ToDoList.size() == 0)
//        {
//            System.out.println("All tasks have been printed.");
//        }



    }
}
