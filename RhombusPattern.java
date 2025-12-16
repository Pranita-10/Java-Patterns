public class RhombusPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the rhombus pattern

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
 