
public class MultipleConditions {
	public static void main(String[] args) {
		int marks=74;
		if(marks>=60&marks<75) {
			 System.out.println("first class");
		}else if(marks>=75&marks<=100) {
			System.out.println("distinction");
		}else if(45<=marks&marks<60) {
			System.out.println("second class");
		}else if(35<=marks&marks<45) {
			System.out.println("third class");
		}else if(0<=marks&marks<35) {
			System.out.println("fail");
		}else 
			System.out.println("invalid marks");
			
	}

}
