package bootcamp;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    	int l = s.length();
    	long ans=0;
    	long count1 = l/n, count2 = l%n;
    	for(int i=0; i<l; i++) {
    		if(s.charAt(i) == 'a') {
    			ans++;
    		}
    	}
    	ans *= count1;
    	for(int j=0; j<count2; j++) {
    		if(s.charAt(j) == 'a') {
    			ans++;
    		}
    	}
    // Write your code here
    	return ans;
    }

}
public class RepeatedString {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
