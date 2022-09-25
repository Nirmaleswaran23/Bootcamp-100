package bootcamp;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String result = pangrams(s);
        System.out.print(result);
        bufferedReader.close();
    }
    public static String pangrams(String s) {
        HashSet h = new HashSet();
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++) {
        	h.add(s.charAt(i));
        }
        if(h.contains(' ')){
            h.remove(' ');
    } 
        if(h.size() == 26) return "pangram";
        else return "not pangram";
        }
}