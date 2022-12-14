package bootcamp;
import java.util.*;
public class ValidWords{
	public static int countValidWords(String sentence) {
        String regex = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
        String r2 = "[^0-9]+";
        String[] arr = sentence.split("\\s+");
        int ans = 0;
        for(String s: arr)
        {
            if(s.matches(regex) && s.matches(r2))
            {
                ans++;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(countValidWords(s));        
	}
}