public class NumericalPattern {
             public static void main(String[] args) {
                 int rows = 5; // Number of rows for the numerical pattern

                 for (int i = 1; i <= rows; i++) {
                     // Print spaces
                     for (int j = i; j < rows; j++) {
                         System.out.print(" ");
                     }
                     // Print numbers
                     for (int k = 1; k <= (2 * i - 1); k++) {
                         System.out.print(i);
                     }
                     System.out.println();
                 }
             }
}
