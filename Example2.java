package For2;

public class Example2 {
	public static void main(String[] args) {
		int[] a= {432,876,908,666,789,543};
		for (int ab:a) {
			//System.out.println(ab);
		}
		
		
		int[] b= {999,32,876,908,666,789,543};
		int max = 0;
		for(int bb:b) {
			if(max < bb) {
				max = bb;
			}
		}
		System.out.println(max);
		
	}
}
