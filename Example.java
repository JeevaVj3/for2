package For2;

public class Example {
	public static void main(String[] args) {
		int[] a = {321,560,764,333,432};
		int count = 0;
		for(int i=0; i<a.length ; i++) {
			if(a[i]%2==0) {
				count = count+a[i];
				System.out.println(a[i]);
			}
			else {
				continue;
			}
		}
		System.out.println("Total "+count);
	
	
//	int[] num = {213,250,567,880,769};
//	int max = a[0];
//	for(int i=0 ; i<num.length ; i++) {
//		if (max < num[i]) {
//			max = num[i];
//		}	
//	System.out.println(max);
		
	
//	String[] word  = { "Lion","Tiger","Horse","Elephand"};
//	String m = word[0];
//	for (int i=0;i<word.length ; i++) {
//		if ( m.length()<word[i].length()) {
//			m = word[i];
//	}
//	}
//	System.out.println(m);
	
	
//	String[] word  = { "LION","tiger","HORSE","elephand"};
//	for (int i=0;i<word.length ; i++) {
//		if(word[i]== word[i].toLowerCase() ) {
//			System.out.println(word[i]);
//	}
//		else {
//	    continue;
//		}
// }
}
}
