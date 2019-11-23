package firstproject;

public class ShapePyramid {
	public static void main(String[] args) {
		char i,j,k,l='A';
		for(i='A';i<='E';i++) {
			for(j='A';j<='E'-'i';j++) 
				System.out.print("  ");
			for(k='A'-1;k<l;k++)
				System.out.print(i);
		System.out.println();
		l=(char) (l+2);
		}
	}

}
