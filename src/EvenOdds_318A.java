import java.util.Scanner;

public class EvenOdds_318A {

    public static void main(String[] args) {

        // Read two integers

        Scanner reader = new Scanner(System.in);
        long n = reader.nextLong();
        long k = reader.nextLong();
        reader.close();

        // If k is less than or equals to (n + 1 / 2) then we need an odd number, otherwise even
        // The way we determine the number is: for odd it's (-1) + 2k. For even it's 0 + 2k

        if (k <= ((n+1) / 2)) {
            System.out.print((-1) + 2*k);
        } else {
            System.out.print(((n / 2) * 2) - 2*(n - k));
        }

    }

}
