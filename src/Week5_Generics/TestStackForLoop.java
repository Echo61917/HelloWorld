package Week5_Generics;

public class TestStackForLoop {
        public static void main(String[] args)
        {
            GenericStack<String> students = new GenericStack<>();

            students.push("oscar");
            students.push("lily");
            students.push("octavio");      //when third element is added, array will be resized to 4
            students.push("michelle");
            students.push("pamela");       //when fifth element is added, array will be resized to 8
            students.push("jennifer");

            for( String s : students )    //can traverse the list with a for-each because it implements the Iterable interface
        System.out.println( s );
        }
}
