package ChanghunHan.baekjoon;

import java.io.*;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/20499">
 * https://www.acmicpc.net/problem/20499
 * </a>
 */
public class BOJ_20499 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] KDA = Arrays.stream(br.readLine()
                                    .split("/")
                                 )
                          .mapToInt(Integer :: parseInt)
                          .toArray();
        if (KDA[0] + KDA[2] < KDA[1] || KDA[1] == 0) {
            System.out.print("hasu");
        }
        else {
            System.out.print("gosu");
        }
        br.close();
    }
    
}