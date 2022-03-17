package Week5_Generics;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person( String name, int age ){
        this.name = name;
        this.age = age;
    }

    public String getName(){ return this.name; }
    public int getAge(){ return this.age; }

    public void setName(){
        this.name = name;
    }

    public void setAge(){
        this.age = age;
    }

    @Override
    public int compareTo( Person p ){
        return this.age - p.getAge();
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\n" + "Age: " + this.age;
    }
}