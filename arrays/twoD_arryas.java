import java.util.*;

public class twoD_arrays{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		int arr[][] = new int[6][6];		
		int maxSum = 0;
		int sum[] = new int[16];
		
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				arr[i][j] = in.nextInt();
			}
		}
		
		int k = 0;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				sum[k] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				k = k+1;
			}
		}

		//finding max in the 
		for(int i=0;i<16;i++){
			if(sum[i]>maxSum){
				maxSum = sum[i];
			}
		}

		System.out.println("here's the max sum" + maxSum);

	}
}