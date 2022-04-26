package Week6_DataStructures;

public class Task implements Comparable<Task>{
    private String taskDescription;
    private int taskPriority;

    public Task(String taskDescription, int taskPriority)
    {
        this.taskDescription = taskDescription;
        this.taskPriority = taskPriority;
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public int compareTo(Task t) {return this.taskPriority - t.taskPriority;}

    @Override
    public String toString()
    {
        return "Task Description: " + this.taskDescription + "\n" + "Task Priority: " + this.taskPriority;
    }

}
