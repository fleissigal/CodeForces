import java.util.Scanner;

public class Team_231A {

    public static final int TEAM_MEMBERS_NUM = 3;


    // Done at O(n) - going over the data just once and updating the result on the go.
    // Going over the data twice will still be O(n) but this is faster, especially with large data
    public static void main(String[] args) {


        // Scan the first integer

        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        int result = 0;

        // Scan the data and add to the result variable (scan smarter!) - no need to go over the data twice

        int rowSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < TEAM_MEMBERS_NUM; j++) {
                rowSum += reader.nextInt();
            }
            if (rowSum > 1) result++;
            rowSum = 0;
        }

        reader.close();

        System.out.print(result);
    }

}
