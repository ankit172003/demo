package hi;

public class Array_rotate {

	public static void main(String[] args) {
		int[] a = {4,5,6,8,9,10,2};
		int k = 3;
		int[] b = new int[a.length];
		for(int i = 0; i<a.length;i++) {
			//b[(a.length-1)-((a.length-1)- i)-k] = a[i];
			int index = (a.length-1)-((a.length-1)- i)-k;
			System.out.println(index);
		}
		for(int i= 0; i<b.length;i++) {
			System.out.print(b[i] +" ");
		}
	}

}
