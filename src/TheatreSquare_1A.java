import java.util.Scanner;

public class TheatreSquare_1A {

    public static final int DIMENSIONS_NUM = 3;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        long dimensions[] = new long[DIMENSIONS_NUM]; // height, width, square
        for (int i = 0; i < DIMENSIONS_NUM; i++) {
            dimensions[i] = reader.nextInt();
        }
        reader.close();

        long neededForHeight = dimensions[0] / dimensions[2];
        if (dimensions[0] % dimensions[2] != 0) neededForHeight++;
        long neededForWidth = dimensions[1] / dimensions[2];
        if (dimensions[1] % dimensions[2] != 0) neededForWidth++;

        System.out.print(neededForHeight * neededForWidth);
    }
}
