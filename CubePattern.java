public class CubePattern {
    public static void main(String[] args) {
        int size = 6; // Size of the cube pattern

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
