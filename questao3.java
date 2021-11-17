import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Ex3 {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        String vetor, end = scan.nextLine();
        BufferedReader bastaler = new BufferedReader(new FileReader(end));
        int j = 0;
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                vetor = bastaler.readLine();
                a[i][j] = Integer.parseInt(vetor);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                vetor = bastaler.readLine();
                a[i][j] = Integer.parseInt(vetor);
            }
        }
        if ((a[0][1] < a[1][0]) || (a[1][1] < (a[0][0]) || (b[0][1] < b[1][0]) || (b[1][1] < b[1][1])
                || (a[1][0] > (a[0][1]) || (b[0][0] > b[1][1]) || (b[1][0] > b[0][1])) {
            System.out.print('1');
        } else {
            System.out.print('0');
        }
        scan.close();
        bastaler.close();
    }

}