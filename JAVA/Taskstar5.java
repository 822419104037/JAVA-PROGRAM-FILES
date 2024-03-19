public class Taskstar5 {
    public static void main(String[] args) {
        int rows = 7; // Define the number of rows for the pyramid
        
        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for printing spaces
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
