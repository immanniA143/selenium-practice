
public class AssendngOrder {
	public static void main(String[] args) {
		int[] arr= {61,45,75,59,201,5454,5,4,58};
		int i=0;
		while(i<=8)
		{
			int j=i+1;
			while(j<=8) {
				if(arr [i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			System.out.print(arr[i]+"  ");
			i++;
		}
		 
		}
} 
