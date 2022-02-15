public class Person {
    //Data fields (instance & static variable)
    private String firstName, lastName, sex;
    private int age;
    private double weight;

    //Constructor (executed when new Person is created)
    public Person (String fN, String lN, String s, int a, double w)
    {
        this.firstName = fN;
        this.lastName = lN;
        this.sex = s;
        this.age = a;
        this.weight = w;
    }

    //mutator/setter methods (used to modify private data fields)
    public void setFirstName(String fN){this.firstName = fN;}
    public void setLastName(String lN) {this.lastName = lN;}
    public void setSex(String s) {this.sex = s;}
    public void setAge(int a){this.age = a;}
    public void setWeight(double w){this.weight = w;}

    //accessor/getter methods (used to access value of private data fields)
    public String getFirstName(){ return this.firstName;}
    public String getLastName() { return this.lastName;}
    public String getSex() {return this.sex;}
    public int getAge() { return this.age;}
    public double getWeight(){ return this.weight;}

    //toString method (returned when person object is referenced)
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + "\n" +
                "Age: " + this.age + "\n" +
                "Sex: " + this.sex + "\n" +
                "Weight: " + this.weight;
    }
}
