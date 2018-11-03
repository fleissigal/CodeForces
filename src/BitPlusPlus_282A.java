import java.util.Scanner;

public class BitPlusPlus_282A {

    // Done at O(n) - going over the data just once and updating the result on the go.
    // Going over the data twice will still be O(n) but this is faster, especially with large data
    public static void main(String[] args) {

        // Scan the first integer

        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        int result = 0;

        // Scan the data and add to the result variable (scan smarter!) - no need to go over the data twice

        String line;
        for (int i = 0; i < n; i++) {
            line = reader.nextLine();
            if (line.contains("++")) {
                result++;
            } else {
                result--;
            }
        }
        reader.close();

        System.out.print(result);
    }

}
