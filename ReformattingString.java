package bootcamp;
import java.util.Scanner;
public class ReformattingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.print(reformat(s));
		sc.close();
	}
    public static String reformat(String s) {
    	StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        
        if(s.length()==1)
            return s;
        
        for(char c : s.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                letters.append(c);
            } else {
                digits.append(c);
            }
        }
        
        if(letters.length()==0 || digits.length()==0 || Math.abs(letters.length()-digits.length())>1)
            return "";
        
        StringBuilder res = new StringBuilder();
        int min = Math.min(letters.length(),digits.length());
        for(int i=0;i<min;i++) {
            if(letters.length()>digits.length()){
                res.append(letters.charAt(i));
                res.append(digits.charAt(i));
            }
            else {
                res.append(digits.charAt(i));
                res.append(letters.charAt(i));
            }
        }
        
        if(letters.length()>digits.length())
            res.append(letters.charAt(min));
        else if(letters.length()<digits.length())
            res.append(digits.charAt(min));
        
        return res.toString();
    }
}
