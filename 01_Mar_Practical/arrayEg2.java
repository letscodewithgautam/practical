package array;

public class arrayEg2 {
	public static void main(String[] args) {
		int a[]=new int[5]; // Declaration & instantiation
		// initialization
		
		a[0]=2;
		a[1]=4;
		a[2]=8;
		a[3]=16;
		a[4]=32;
		// // traversing(printing one after another) an array using for each loop
		for (int i = 0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
