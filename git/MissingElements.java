package week1day1;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 6 };
		int n = nums.length;
		int sum = 0;
		sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++) {
			sum -= nums[i];

		}
		System.out.println(sum);

		int[] arr = { 2, 3, 1, 4, 6, 8 };

		Arrays.sort(arr);// 1, 2,3,4,6,7

		for (int i = 1; i < arr.length; i++) {
			if (i != arr[i - 1])

			{
				System.out.println("The Missing Element is :" + i);
				continue;

			}
		}

	}
}