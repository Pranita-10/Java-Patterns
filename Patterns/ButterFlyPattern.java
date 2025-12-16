public class ButterFlyPattern {
    public static void main(String[] args) {
        int rows = 3; // Number of rows for the butterfly pattern

        // Upper half of the butterfly
        for (int i = 1; i <= rows; i++) {
            // Print stars on the left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            // Print stars on the right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = rows; i >= 1; i--) {
            // Print stars on the left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces in the middle
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            // Print stars on the right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
