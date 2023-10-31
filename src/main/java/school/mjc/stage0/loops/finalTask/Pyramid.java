package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int currentNumber = 1;
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print("  "); // Using two spaces for alignment
            }

            // Print left side of the pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }

            // Print right side of the pyramid
            for (int j = 2; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }

            // Move to the next line for the next row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
