import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Ex1 {
  public static void main(String args[]) throws IOException {
    int a = 0, b, c, v[] = new int[10010];
    Scanner scan = new Scanner(System.in);
    String b1, c1, vetor, end = scan.nextLine();
    BufferedReader bastaler = new BufferedReader(new FileReader(end));
    b1 = bastaler.readLine();
    c1 = bastaler.readLine();
    b = Integer.parseInt(b1);
    c = Integer.parseInt(c1);
    for (int i = 0; i < c; i++) {
      vetor = bastaler.readLine();
      v[i] = Integer.parseInt(vetor);
      if (v[i] > a) {
        a = v[i];
      }
    }
    int i = 1;
    int r = 0;
    while (i <= a) {
      int t = (i + a) / 2;
      if (ok(t, b, v, c)) {
        if (t > r) {
          r = t;
        }
        i = t + 1;
      } else {
        a = t - 1;
      }
    }
    System.out.print(r);
    bastaler.close();
    scan.close();
  }
  public static boolean ok(int q, int b, int[] v, int c) {
    int qdd = 0;
    for (int i = 0; i < c; i++) {

      qdd += v[i] / t;

      if (qdd >= b)
        return true;
    }
    return false;
  }
}