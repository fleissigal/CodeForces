import java.util.Scanner;

public class Football_96A {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        reader.close();

        String result;
        // Scan the data and add to the result variable (scan smarter!) - no need to go over the data twice

        if (input.contains("0000000") || input.contains("1111111")) {
            result = "YES";
        } else {
            result = "NO";
        }

        System.out.print(result);
    }

}
