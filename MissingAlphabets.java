package bootcamp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
 
public class MissingAlphabets {
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	long M = 1000000007;
 
	void solve() {
		int t = ni();
		while (t-- > 0) {
			char[] s = ns().toCharArray();
			int[] rank = new int[26];
			for (int i = 0; i < 26; i++)
				rank[s[i] - 'a'] = i;
			int n = ni();
			List<String> l = new ArrayList<String>();
			for (int i = 0; i < n; i++)
				l.add(ns());
			Collections.sort(l, new Comparator<String>() {
				public int compare(String o1, String o2) {
					for (int i = 0; i < Math.min(o1.length(), o2.length()); i++)
						if (o1.charAt(i) != o2.charAt(i))
							return rank[o1.charAt(i) - 'a'] - rank[o2.charAt(i) - 'a'];
					return o1.length() - o2.length();
				}
			});
			for (String si : l) {
				out.println(si);
			}
 
		}
 
	}
 
	private long solve(char[] s, int a, int b) {
		long ans = 0;
		for (int j = 0; j < s.length / 2; j++) {
			if (s[j] == s[s.length - 1 - j]) {
				if (s[j] == '/')
					ans += Math.min(a, b) * 2;
			} else {
				if (s[j] != '/' && s[s.length - 1 - j] != '/')
					return -1;
				if (s[j] == 'a' || s[s.length - 1 - j] == 'a')
					ans += a;
				else
					ans += b;
			}
		}
		if (s.length % 2 == 1 && s[(s.length + 1) / 2 - 1] == '/')
			ans += Math.min(a, b);
		return ans;
	}
 
	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
 
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}
 
	public static void main(String[] args) throws Exception {
		new MissingAlphabets().run();
	}
 
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
 
	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
 
	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}
 
	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}
 
	private double nd() {
		return Double.parseDouble(ns());
	}
 
	private char nc() {
		return (char) skip();
	}
 
	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
 
	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n) {
			if (!(isSpaceChar(b)))
				buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
 
	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
 
	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
 
	private int[][] na(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = na(m);
		return a;
	}
 
	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
 
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
 
	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
 
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
 
	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}