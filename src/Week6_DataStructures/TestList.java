package Week6_DataStructures;

public class TestList {
    public static void main(String[] args)
    {
        List<String> names = new List<>();

        names.add("Carlos");
        names.add("Will Smith");
        names.add("Chris Rock");
        names.add("GI Jane");
        names.add("Joe Byron");

        System.out.println(names);

        names.add(54, "John Ham");
        System.out.println(names);


    }



}
