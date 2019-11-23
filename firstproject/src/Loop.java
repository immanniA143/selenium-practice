
public class Loop {
public static void main(String[] args) {
	int cr,pr,nuni,bill;
	cr=12311;
	pr=12271;
	nuni=cr-pr;
	if(nuni<=50) {
		bill=nuni*2;
	}else if(nuni>50&nuni<=100) {
		bill=nuni*3;
	}else {
		bill=nuni*4;
	}
	System.out.println("the final bill is"+bill);
}
}
