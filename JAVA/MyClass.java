public class MyClass {
    private int intValue;
    private String stringValue;

    // Default constructor
    public MyClass() {
        // Initialize with default values
        intValue = 0;
        stringValue = "";
    }

    // Copy constructor
    public MyClass(MyClass other) {
        this.intValue = other.intValue;
        this.stringValue = other.stringValue;
    }

    // Method to set values
    public void setValues(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    // Method to display values
    public void display() {
        System.out.println("intValue: " + intValue);
        System.out.println("stringValue: " + stringValue);
    }

    public static void main(String[] args) {
        // Create an object using default constructor
        MyClass original = new MyClass();
        original.setValues(10, "Hello");

        // Use the copy constructor to create a new object
        MyClass copy = new MyClass(original);

        // Display values of both objects
        System.out.println("Original object:");
        original.display();
        System.out.println("\nCopied object:");
        copy.display();
    }
}
