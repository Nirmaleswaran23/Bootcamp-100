package bootcamp;
import java.util.Scanner;
public class DeleteOperationForTwoStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		System.out.print(minDistance(word1,word2));
		sc.close();
	}
	public static int minDistance(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text1.length();i++){
            for(int j=0;j<=text2.length();j++){
                if(i==0 || j==0){
                    dp[i][j] = i+j;
                }
                
                else if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
