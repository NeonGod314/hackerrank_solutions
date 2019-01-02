import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class dynamic_array{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int lastans = 0;
		List<Integer>[] sequences = new List[n];

		for(int n_i=0; n_i<n; n_i++){
			sequences[n_i] = new ArrayList<>();
		}
		for(int i=0; i<q; i++){
			int t = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();

			List<Integer> sequence = sequences[(x^lastans)%n];
			switch(t){
				case 1:
					sequence.add(y);
					break;
				case 2:
					lastans = sequence.get(y%sequence.size());
					System.out.println(lastans);	
					break;
			}

		}
		System.out.println("hey there: ", sequences);
		System.out.println("hey there: ", sequences[0]);
	}
}