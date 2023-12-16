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

//Recursive Approach of Binary Search
import java.util.*;

class TUF {
    public static int BinarySearch(int[] arr, int low, int high, int target) {
        if(low > high) return -1;
       
            int mid = (low + high) / 2;
            if(arr[mid] == target) return mid;
            else if(target > arr[mid])
                return BinarySearch(arr, mid + 1, high, target);
            return BinarySearch(arr, low, mid - 1, target);
        
        
    }
    public int search(int[] nums, int target) {
            return BinarySearch(nums,0,nums.length - 1, target);
        } 
    
}

class Main
{
	public static void main(String[] args) {
	     TUF tuf = new TUF(); // Create an instance of TUF
		int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};
		int target = 16;
		int ind = tuf.search(arr,target);
		if(ind == -1) System.out.println("Element is not found");
		else System.out.println("Element is found in the index of: " + ind);
	}
}

//Both Iterative and Recursive approch Time Complexity is
T(N) : O(logn) 
