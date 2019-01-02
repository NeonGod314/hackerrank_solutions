import java.util.Scanner;

public class array_ds{
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);		
		
		int len = in.nextInt();
		int arr[] = new int[len];
		
		for(int i = 0;i<len;i++){
			arr[i] = in.nextInt();
		}
		
		int temp;
		
		for(int i=0;i<len/2;i++){
			temp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = temp;
		}
		
		for(int i = 0;i<len;i++){
			System.out.print(arr[i] + " ");
		}
	}
}