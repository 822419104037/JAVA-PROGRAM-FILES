public class MultipleConstructors {

    private int intValue;
    private String stringValue;

    // Constructor with no parameters
    public MultipleConstructors() {
        // Initialize with default values
        intValue = 0;
        stringValue = "";
    }

    // Constructor with one parameter (int)
    public MultipleConstructors(int intValue) {
        this.intValue = intValue;
        this.stringValue = "Default";
    }

    // Constructor with one parameter (String)
    public MultipleConstructors(String stringValue) {
        this.intValue = 0;
        this.stringValue = stringValue;
    }

    // Constructor with two parameters (int, String)
    public MultipleConstructors(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // Method to display values
    public void display() {
        System.out.println("intValue: " + intValue);
        System.out.println("stringValue: " + stringValue);
    }

    public static void main(String[] args) {
        // Instantiate objects using different constructors
        MultipleConstructors obj1 = new MultipleConstructors();
        MultipleConstructors obj2 = new MultipleConstructors(10);
        MultipleConstructors obj3 = new MultipleConstructors("Hello");
        MultipleConstructors obj4 = new MultipleConstructors(20, "World");

        // Display results
        System.out.println("Object 1:");
        obj1.display();
        System.out.println("\nObject 2:");
        obj2.display();
        System.out.println("\nObject 3:");
        obj3.display();
        System.out.println("\nObject 4:");
        obj4.display();
    }
}
