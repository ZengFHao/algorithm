import org.testng.annotations.Test;

public class MaxSum {
    public int maxSUM(int[] num){
        int max_sum = num[0];
        int sum = num[0];
        for(int i = 1; i < num.length; i++){
            sum = Math.max(sum + num[i], num[i]);
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }

    @Test
    public void test(){
        int[] num = new int[]{-2, 11, -4, 13, -5, -2, 30};
        System.out.println(maxSUM(num));
    }
}
