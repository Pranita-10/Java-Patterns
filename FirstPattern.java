public class FirstPattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows for the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
