package bootcamp;
import java.util.*;
public class AliceAndStrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		boolean res=true;
		if(str1.length()==str2.length()){
			for(int i=0;i<str1.length();i++){
				int diff = Character.compare(str2.charAt(i),str1.charAt(i));
				if(diff>=0) {	
				}
				else{
					res=false;
					break;
				}
			}
			if(res){
				System.out.println("YES");
				}else{
					System.out.println("NO");
					}
			}
		else{
			System.out.println("NO");
			}
		s.close();
		}
	    
	}
