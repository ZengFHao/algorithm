import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LCS {
    public int LCSTest1(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[][] dp = new int[c1.length+1][c2.length+1];
        for(int i = 1; i <= c1.length; i++){
            for(int j = 1; j <= c2.length; j++){
                if(c1[i-1] == c2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[c1.length][c2.length];
    }
    public int LCSTest2(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[][] dp = new int[c1.length+1][c2.length+1];
        int max = 0;
        for(int i = 1; i <= c1.length; i++){
            for(int j = 1; j <= c2.length; j++){
                if(c1[i-1] == c2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        return max;
    }
    @Test
    public void test(){
        String s1 = "MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCALLAAQANKESSSESFISRLLAIVAD";
        String s2 = "MAEEEVAKLEKHLMLLRQEYVKLQKKLAETEKRCTLLAAQANKENSNESFISRLLAIVAG";
        System.out.println(LCSTest1(s1, s2));
        System.out.println(LCSTest2(s1, s2));
    }
}
