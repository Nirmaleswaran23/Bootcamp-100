package bootcamp;
import java.util.Scanner;
public class wordSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		char[][] board = new char[row][column];
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				board[i][j] = sc.next().charAt(0);
			}
		}
		sc.nextLine();
		//scanning the word
		String word = sc.nextLine();
		System.out.print(exist(board, word));
		sc.close();
	}
	public static boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(help(i,j,n,m,word,vis,board,0)){
                  return true;
              }
            }
        }
        return false;
    }
    public static boolean help(int i,int j,int n,int m,String word,int vis[][],char[][] board,int index){
        if(index==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=n || j>=m || vis[i][j]==1 || 
           word.charAt(index)!=board[i][j]){
            return false;
        }
    vis[i][j]=1;
        boolean a=help(i+1,j,n,m,word,vis,board,index+1);
        boolean b=help(i,j+1,n,m,word,vis,board,index+1);
        boolean c=help(i,j-1,n,m,word,vis,board,index+1);
        boolean d=help(i-1,j,n,m,word,vis,board,index+1);
        if(a|| b|| c|| d) return true;
        vis[i][j]=0;
        return false;
    }		
}
