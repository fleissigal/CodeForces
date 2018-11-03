import java.util.Scanner;

public class StringTask_118A {


    public static void main(String[] args) {

        // Scan the word into a variable
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        reader.close();

        // Go over the string and make it all lowercase (toLowerCase returns the lowercase string)
        word = word.toLowerCase();

        // Go over it and delete all vowels (building a new String)

        String lowerCaseWord = "";

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'e' &&
                word.charAt(i) != 'o' && word.charAt(i) != 'u' &&
                word.charAt(i) != 'y' && word.charAt(i) != 'i') {
                lowerCaseWord += word.charAt(i);
            }
        }

        // Go over it and add points before (building a new string)

        String result = "";
        for (int i = 0; i < lowerCaseWord.length(); i++) {
            result += '.';
            result += lowerCaseWord.charAt(i);
        }

        System.out.print(result);


    }
}
