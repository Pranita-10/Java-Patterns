public class NumberIncreasePyramid {
    public static void main(String[] args) {
        int rows = 6; // Number of rows for the number increase pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
