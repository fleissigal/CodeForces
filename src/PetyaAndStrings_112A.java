import java.util.Scanner;

public class PetyaAndStrings_112A {


    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        String str1 = reader.nextLine();
        String str2 = reader.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(-1);
                return;
            } else if ((str1.charAt(i) > str2.charAt(i))) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
        return;
    }

}
