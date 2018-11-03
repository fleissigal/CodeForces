//import javafx.util.Pair;
//
//import java.util.Scanner;
//
//public class VasyaAndMultisets_Round51C {
//
//
//    public static void main(String[] args) {
//
//        Scanner reader = new Scanner(System.in);
//
//        int n = reader.nextInt();
//
//        int[] buckets = new int[101];
//        int[] originals = new int[101];
//
//        for (int i = 1; i <= n; i++) {
//            int a = reader.nextInt();
//            originals[i] = a;
//            buckets[a]++;
//        }
//
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(originals[i]);
//            System.out.print(' ');
//        }
//        System.out.print("\n");
//
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(buckets[i]);
//            System.out.print(' ');
//        }
//        System.out.print("\n");
//
//        // Now we have buckets 0 to 100 and each number filled with hoe many times it got filled.
//        reader.close();
//
//        char[] letters = new char[101];
//
//        char tmp = 'A';
//
//        for (int i = 1; i <= 100; i++) {
//            int next = originals[i];
//            if (letters[next] == 'A' || letters[next] == 'B' || letters[next] == 'C') break;
//            if (buckets[next] == 1) {
//                letters[next] = tmp;
//                tmp = (tmp == 'A' ? 'B' : 'A');
//            }
//            if (buckets[next] == 0) letters[next] = 'C';
//            if (buckets[next] > 1) letters[next] = 'A';
//        }
//
//
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(letters[i]);
//            System.out.print(' ');
//        }
//        System.out.print("\n");
//
//
//        if (tmp == 'B') {
//            System.out.print("NO");
//        } else {
//            System.out.print("YES");
//            System.out.print("\n");
//            String result = "";
//            for (int i = 1; i <= n; i++) {
//                if (letters[originals[i]] == 'A' || letters[originals[i]] == 'B') {
//                    result += Character.toString(letters[originals[i]]);
//                } else {
//                    if (buckets[])
//                }
//                if (letters[i] != 'C') result += Character.toString(letters[i]);
//            }
//            System.out.print(result);
//        }
//    }
//
//}
