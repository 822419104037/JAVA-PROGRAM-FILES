public class Taskstar2 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < rows; j++) {
                
                if (j == 0)
                    System.out.print("* ");
                
                else if (i == rows - 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
