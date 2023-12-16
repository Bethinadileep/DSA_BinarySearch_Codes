//Binary Search Iterative Approach
import java.util.*;

class TUF {
    public int BinarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) return mid;
            else if(target > arr[mid])
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    
}
class Main
{
	public static void main(String[] args) {
	     TUF tuf = new TUF(); // Create an instance of TUF
		int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};
		int target = 16;
		int ind = tuf.BinarySearch(arr,target);
		if(ind == -1) System.out.println("Element is not found");
		else System.out.println("Element is found in the index of: " + ind);
	}
}
