import java.util.Scanner;

public class DominoPiling_50A {

    public static final int DOMINO_WIDTH = 2;

    public static void main(String[] args) {

        // Scan the data and store the data in variables

        Scanner reader = new Scanner(System.in);

        int m = reader.nextInt();
        int n = reader.nextInt();

        reader.close();

        // The math logic: if the product of MxN is even, we can fill the whole board with MxN / 2 tiles,
        // Otherwise we can almost fill the board so we can use |MxN / 2| tiles. Also: (MxN - 1) / 2

        int product = m * n;

        if (product % DOMINO_WIDTH == 0) {
            System.out.print(product / 2);
        } else {
            System.out.print((product - 1)/ 2);
        }
    }
}
