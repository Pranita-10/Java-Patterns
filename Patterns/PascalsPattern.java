public class PascalsPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the Pascal's triangle pattern

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int j = i; j < rows - 1; j++) {
                System.out.print(" ");
            }
            // Print Pascal's triangle values
            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}