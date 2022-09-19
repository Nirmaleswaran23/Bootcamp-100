package bootcamp;
import java.util.Scanner;
public class peakElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<n; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.print(findPeakElement(nums));
		scan.close();
	}
	public static int findPeakElement(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }
    public static int search(int[] nums, int l, int r) {
        if (l == r)
            return l;
        int mid = (l + r) / 2;
        if (nums[mid] > nums[mid + 1])
            return search(nums, l, mid);
        return search(nums, mid + 1, r);
    }
}