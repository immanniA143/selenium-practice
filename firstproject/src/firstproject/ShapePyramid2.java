package firstproject;

public class ShapePyramid2 {
	public static void main(String[] args) {
		int i,j,k,l=0;
		for(i=1;i<=5;i++) {
			for(j=5-i;j>=1;j--) 
				System.out.print("  ");
			for(k=l;k>=-l;k--)
				System.out.print((char)('A'+Math.abs(k)));
			l=l+1;
			System.out.print('\n');
			}
		}
	}
