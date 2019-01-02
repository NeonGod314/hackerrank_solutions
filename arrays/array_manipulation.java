import java.util.Scanner;

public class array_manipulation{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int len = in.nextInt();
		int noQ = in.nextInt();

		long arr[] = new long[len+1];
		
		//System.out.println(max);

		for(int i=0;i<noQ;i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			
			arr[a-1] = arr[a-1] + k;
			arr[b] = arr[b] - k;

		}

		long max = arr[0];
		for(int i=1;i<len;i++){
			arr[i] = arr[i]+arr[i-1];
			if (arr[i]>max)
				max = arr[i];
		}
		
		System.out.println(max);
	}
}