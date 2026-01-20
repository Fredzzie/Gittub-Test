public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Display information
        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("Person 2:");
        person2.displayInfo();

        // Modify and display again
        person1.setAge(26);
        System.out.println("After birthday:");
        person1.displayInfo();
    }
}