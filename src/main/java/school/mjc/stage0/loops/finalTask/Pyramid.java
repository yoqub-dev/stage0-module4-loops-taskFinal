package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print("  "); // Using two spaces for alignment
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers starting from 2
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
