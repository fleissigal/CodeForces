import java.util.Scanner;

public class TheNewYearMeetingFriends_723A {

    public static final int NUM_OF_FRIENDS = 3;
    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 1;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int max = MIN_NUMBER - 1;
        int min = MAX_NUMBER + 1;

        int tmp;

        for (int i = 0; i < NUM_OF_FRIENDS; i++) {
            tmp = reader.nextInt();
            if (tmp > max) max = tmp;
            if (tmp < min) min = tmp;
        }

        reader.close();

        System.out.print(max - min);
    }

}
