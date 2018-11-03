import java.util.Scanner;

public class RelativelyPrimePairs_Round51B {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        long l = reader.nextLong();
        long r = reader.nextLong();

        reader.close();

        System.out.print("YES" + "\n");
        long j = l;

        for (long i = 0; i < (r-l+1)/2; i++) {
            System.out.print(j);
            System.out.print(" ");
            System.out.print(j+1);
            System.out.print("\n");
            j += 2;
        }

    }

}
