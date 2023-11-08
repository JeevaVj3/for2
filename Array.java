package For2;

public class Array {
	public static void main(String[] args) {
//		int[] arr = {10,20,30,40};
//		for(int i=0 ; i<arr.length ;i++) {
//			System.out.println(arr[i]);
//		}
//		int[] nums = new int[4];
//		nums[0]=30;
//		nums[1]=20;
//		nums[2]=10;
//		nums[3]=0;
//		for(int i=0; i<nums.length ;i++) {
//			System.out.println(nums[i]);
//		}
		
		
		int[] a = {321,560,764,333,432};
		int count = 0;
		for(int i=0; i<a.length ; i++) {
			if(a[i]%2==0) {
				continue;
			}
			else {
				count = count+a[i];
				System.out.println(a[i]);
			}
		}
		System.out.println("Total "+count);
		System.out.print(count);
	}
}
