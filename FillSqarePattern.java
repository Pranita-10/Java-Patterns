public class FillSqarePattern {
                public static void main(String[] args) {
                    int size = 3; // Size of the filled square

                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size; j++) {
                            // Print star for every position
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
}
