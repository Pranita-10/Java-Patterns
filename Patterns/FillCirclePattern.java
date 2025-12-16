public class FillCirclePattern {
    public static void main(String[] args) {
        int radius = 5; // Radius of the filled circle

        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                // Check if the point is inside the circle
                if (i * i + j * j <= radius * radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
