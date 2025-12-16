public class ReverseRightPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the reverse right triangle pattern

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = i; k <= rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}