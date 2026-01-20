public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // New method to greet
    public void greet() {
        System.out.println("Hello, my name is " + name + "!");
    }
}