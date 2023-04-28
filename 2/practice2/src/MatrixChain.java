import org.testng.annotations.Test;

public class MatrixChain{
    public int printTime(int[] arr){
        int len = arr.length;
        int[][] dp = new int[len][len];
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i < len; i++){
            dp[i][i] = 0;
        }
        for(int l = 2; l < len; l++){
            for(int i = 1; i < len - l + 1; i++){
                int j = i + l - 1;

                for(int k = i; k < j; k++){
                    int cost = dp[i][k] + dp[k+1][j] + arr[i-1] * arr[k] * arr[j];
                    if(cost < dp[i][j])
                        dp[i][j] = cost;

                }
            }
        }
        return dp[1][len - 1];
    }
    @Test
    public void test(){
        int[] arr = new int[]{3,5,2,1,10};
        System.out.println(printTime(arr));
    }
}
