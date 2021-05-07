
public class SortArray {
	
	public static void main(String args[]) {
		
		int [] a = new int [] {81,28,26,41,25};
		int i, j, temp;
		
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Increasing Order :");
		for(j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Decreasing Order :");
		for(j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}		
	}
}
