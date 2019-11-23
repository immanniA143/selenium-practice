
public class JobEligibility {
	public static void main(String[] args) {
		int edup=75,exp=0,cp=60;
		if((exp>=2&edup>35) | (exp>=1&exp<2&cp>=60)|(exp==0&edup>=60&cp>=70)) {
			System.out.println("eligible");
		}else
			System.out.println("not eligible");
	}

}
