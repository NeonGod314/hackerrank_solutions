import java.util.Scanner;

public class sparse_arrays{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int noStrings = in.nextInt();
		String[] stringList = new String[noStrings];
		in.nextLine();
		for(int i=0;i<noStrings;i++){
			stringList[i] = in.nextLine();
		}
		
		int noQstrings = in.nextInt();
		in.nextLine();		
		String[] qStringList = new String[noQstrings];
		for(int i=0;i<noQstrings;i++){
			qStringList[i] = in.nextLine();	
		}

		
		int maxCount = 0;

		for(int i=0; i<noQstrings;i++){
			int presentCount = 0;
			
			for(int j=0;j<noStrings;j++){
				if (qStringList[i].equals(stringList[j])){
					presentCount = presentCount + 1;
				}	
			}
			System.out.println(presentCount);
		}
	}
}