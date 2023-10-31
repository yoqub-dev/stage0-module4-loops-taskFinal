package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print asterisks for the pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
