package firstproject;

public class ShapePattern2 {
	public static void main(String[] args) {
		int i,j,k,m,l=1;
		for(i=1;i<=5;i++) {
			for(j=5-i;j>=1;j--)
				System.out.print("  ");
			for(k=0;k<=l-1;k++)
				System.out.print((char)('A'+k));
			for(m=l-2;m>=0;m--)
				System.out.print((char)('A'+m));
			l=l+1;
			System.out.println();
		}
	}

}
