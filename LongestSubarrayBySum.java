package testing;

public class LongestSubarrayBySum {
	int[] findLongestSubarrayBySum(int s, int[] arr) {
		//initilize the result to -1 in case we don't find any sub array
		int[] result = new int[] {-1};
		
		int sum = 0;
		// left pointer
		int left = 0;
		// right pointer
		int right = 0;
		
		//sliding window
		while (right <arr.length) {
			sum += arr[right];
			while (left < right && sum > s ) {
				sum -= arr[left++];
			}
			if (sum == s && (result.length == 1 || result[1] - result [0] < right - left)) {
				result = new int[] {left +1, right +1};
		}
		right++;
	}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
