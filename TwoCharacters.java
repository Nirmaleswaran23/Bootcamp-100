package bootcamp;
import java.io.*;
import java.util.*;
class Result {
    public static List<List<Character>> pair(List<Character> ls)
    {
        List<List<Character>> alph_pair=new ArrayList<>();
        for(int i=0;i<ls.size();i++)
        {
            for(int j=i+1;j<ls.size();j++)
            {
                List<Character> lst=new ArrayList<>();
                lst.add(ls.get(i));
                lst.add(ls.get(j));
                alph_pair.add(lst);
            }
        }
        return alph_pair;   
    }
    public static int check(String s, List<Character> lst)  // Returns size of alternate pair string
    {
        char nxt_char=(s.indexOf(lst.get(0))>s.indexOf(lst.get(1)))? lst.get(1):lst.get(0);     // checking which character to begin with.
        int nxt_char_idx=lst.indexOf(nxt_char);
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==lst.get(0) || ch==lst.get(1))
            {
                cnt++;
                if(ch==nxt_char){       // Alternation check
                    nxt_char=(nxt_char_idx==0)? lst.get(1):lst.get(0);
                    nxt_char_idx=lst.indexOf(nxt_char);
                }
                else
                    return 0;
            }
        }
        return cnt;       
    }
    public static int alternate(String s) {
    // Write your code here
        Set<Character> hs = new HashSet<Character>();
        for(int i=0;i<s.length();i++)   // All distinct alphabets stored in the hashset.
            hs.add(s.charAt(i));
        List<Character> ls=new ArrayList<>();
        ls.addAll(hs);  //hashset coverted to list for making pairs efficiently in later stages.
        List<List<Character>> alph_pair=new ArrayList<>();
        alph_pair=pair(ls);  // making all possible pairs of alphabets.

        int ans=0; 
        for(int i=0;i<alph_pair.size();i++) //Iterating through the pairs.
        {
            int res=check(s,alph_pair.get(i));  //Checking if the specific pair is alternate or not.
            if(res>ans) //checks for maximum among all such alternating pairs.
                ans=res;          
        }    
        return ans;
    }
}

public class TwoCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int l = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine();
        int result = Result.alternate(s);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
