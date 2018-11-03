import java.util.Scanner;

public class NextRound_158A {


    public static void main(String[] args) {


        // Scan the data and insert the scores into an array

        Scanner reader = new Scanner(System.in);

        int numOfParticipants = reader.nextInt();
        int kTHParticipant = reader.nextInt();

        int scores[] = new int[numOfParticipants + 1];
        for (int i = 1; i < numOfParticipants + 1; i++) {
            scores[i] = reader.nextInt();
        }
        reader.close();

        // Go over the scores and stop at the k-th score, while counting
        // Continue as long as the score is the same, and return the result

        int result = 0;
        for (int i = 1; i < numOfParticipants + 1; i++) {
            if (scores[i] == 0 || scores[i] < scores[kTHParticipant]) {
                System.out.print(result);
                break;
            }
            result++;
            if (i == numOfParticipants) {
                System.out.print(result);
            }
        }
    }
}
