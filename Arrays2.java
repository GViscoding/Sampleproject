// Min and max value in an Array
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Max
		int[] armax = {74,62,185,96,22,45};
		int imax;
		int max = armax[0];
		for(imax=0;imax<armax.length;imax++) {
			if(armax[imax]>max) {
				max = armax[imax];
			}
			
		}
		System.out.println();
		System.out.println("the Maximum element in this Array is : "+ max);
		
		//Min
				int[] ar = {74,62,185,96,22,45};
				int imin;
				int min = ar[0];
				for(imin=0;imin<ar.length;imin++) {
					if(ar[imin]<min) {
						min = ar[imin];
					}
				}
				System.out.println("the Minimum element in this Array is : "+ min);

	}

}
