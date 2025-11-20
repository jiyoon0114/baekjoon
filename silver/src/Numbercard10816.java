import java.util.*;
import java.io.*;

public class Numbercard10816 {
    public static void main(String[] arg) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();
        int n = Integer.parseInt(N);

        Map<Integer,Integer> SangCards = new HashMap<>();

        String Sangcard = br.readLine();
        StringTokenizer st = new StringTokenizer(Sangcard);

        for(int i =0; i<n; i++) {
            Integer key = Integer.valueOf(st.nextToken());
            if(SangCards.containsKey(key)) {
                Integer CurrentValue = SangCards.get(key);
                SangCards.put(key, ++CurrentValue);
            }
            else
                SangCards.put(key, 1);
        }

        String M = br.readLine();
        int m = Integer.parseInt(M);
        int[] Cardnums = new int[m];

        String card = br.readLine();
        StringTokenizer st2 = new StringTokenizer(card);

        for(int i=0; i<m; i++) {
            Cardnums[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i=0; i<m; i++) {
            if(SangCards.containsKey(Cardnums[i])) {
                sb.append(SangCards.get(Cardnums[i]));
                sb.append(" ");
            }
            else {
                sb.append("0");
                sb.append(" ");
            }
        }
        System.out.print(sb);
    }
}

