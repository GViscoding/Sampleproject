import java.util.Scanner;
public class MyNamePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number");
		int n = scan.nextInt();
		int i, j;
		for(i=0;i<n;i++) {
//G
			for(j=0;j<n;j++) {
				if((i==0 && j>0 && j<(3*(n-1))/4) 
					|| (i==(n-1)/2 && j>=(n-1)/2 && j<=(3*(n-1))/4)
					|| (i==(n-1) && j>0 && j<=(n-1)/2)
					|| (j==(n-1)/2 && i>(n-1)/2)
					|| (j==0 && i!=0 && i!=(n-1))
					|| (j==(3*(n-1))/4 && i>(n-1)/2) ) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
//A		
			for(j=0;j<n;j++) {
				if( (i==0 && j>(n-1)/4 && j<(3*(n-1))/4) 
					|| (i==(n-1)/2) && j>(n-1)/4 && j<(3*(n-1))/4
					|| (j==(n-1)/4 && i!=0)
					|| (j==(3*(n-1))/4 && i!=0) 
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
//U		
			for(j=0;j<n;j++) {
				if(
					(i==(n-1) && j>(n-1)/4 && j<(3*(n-1))/4)	
					|| (j==(n-1)/4 && i!=n-1)
					|| (j==(3*(n-1))/4 && i!=n-1)
						) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
//T		
			for(j=0;j<n;j++) {
				if((i==0 && j>=(n-1)/4 && j<=(3*(n-1))/4)
					|| (j==(n-1)/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
//A
			for(j=0;j<n;j++) {
				if( (i==0 && j>(n-1)/4 && j<(3*(n-1))/4) 
					|| (i==(n-1)/2) && j>(n-1)/4 && j<(3*(n-1))/4
					|| (j==(n-1)/4 && i!=0)
					|| (j==(3*(n-1))/4 && i!=0) 
					) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
//M
			for(j=0;j<n;j++) {
				if((i==j && i<=(n-1)/2) 
					|| (j==0)
					|| (j==n-1)
					|| (i+j==n-1 && i<=(n-1)/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
}
