
public class ThirdLarge {

	public static void main(String args[]){
	   int temp;
	   int a[] = {81,29,78,24,11,55};
	   
	   
	   for(int i = 0; i<a.length; i++ ){
	      for(int j = i+1; j<a.length; j++){
	         if(a[i]>a[j]){
	            temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	         }
	      }
	   }
	   System.out.println("Third largest number is "+a[a.length-3]);
   }
}
