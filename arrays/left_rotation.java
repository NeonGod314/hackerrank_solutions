import java.util.Scanner;

 public class left_rotation{
 	public static int[] reverse(int[] arr, int l, int r, int n){
 		
 		int temp;
 		int count = 0;
 		
 		for(int i=l; i < (l+r)/2; i++){
 			temp = arr[i];
 			arr[i] = arr[r-count-1];
 			arr[r-count-1] = temp;
 			count = count+1;
 		}
		
		return arr;
 	}

 	public static int[] rotate(int[] arr,int n, int d){
 		
 		arr = reverse(arr, 0, d, n);
 		arr = reverse(arr, d, n, n);
 		arr = reverse(arr, 0, n, n);
 		
 		return arr;
 	}

 	public static void main(String[] args) {
 		
 		Scanner in = new Scanner(System.in);
 		int n = in.nextInt();
 		int d = in.nextInt();
 		int arr[] =new int[n];
 		
 		//taking array as input
 		for(int i=0; i < n; i++){
 			arr[i] = in.nextInt();
 		}

 		arr = rotate(arr, n, d);
 		//printing the array
 		for(int i=0;i<n;i++){
 			System.out.print(arr[i]+" ");
 		}
 	}
 }