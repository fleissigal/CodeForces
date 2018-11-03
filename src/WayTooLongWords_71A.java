import java.util.Scanner;

public class WayTooLongWords_71A {


    public static void main(String[] args) {


        // Scan the words and insert them into an array

        Scanner reader = new Scanner(System.in);
        String lines = reader.nextLine();
        int numberOfLines = Integer.parseInt(lines);

        String oldWords[] = new String[numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {
            oldWords[i] = reader.nextLine();
        }
        reader.close();

        // Create a new array and fill it with the helper function
        String newWords[] = new String[numberOfLines];

        for (int i = 0; i < numberOfLines; i++) {
            newWords[i] = changeWord(oldWords[i]);
        }

        // Print the new array
        for (int i = 0; i < numberOfLines; i++) {
            System.out.print(newWords[i] + "\n");
        }


    }

    public static String changeWord(String str) {
        if (str.length() < 11) return str;
        String res = "";
        res += String.valueOf(str.charAt(0));
        res += Integer.toString(str.length() - 2);
        res += String.valueOf(str.charAt(str.length() - 1));
        return res;
    }
}
