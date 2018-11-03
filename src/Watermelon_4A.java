import java.util.Scanner;

public class Watermelon_4A {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.close();
        if (n == 2) {
            System.out.print("NO");
        } else {
            System.out.print((n % 2 == 0) ? "YES" : "NO");
        }
    }
}
