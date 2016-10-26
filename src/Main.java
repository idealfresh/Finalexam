
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Import number for 2 to 9: ");

		int a = scan.nextInt();
		if (a < 2 || a > 9) {
			System.out.println("Out of range: ");
		}
		int sum = 0;
		int[] smallarray= new int[a * a];
		for (int i = 0; i < smallarray.length; i++) {
			System.out.println("Import number for  Array: ");
			smallarray[i] = scan.nextInt();
		}
		for (int i = 0; i < smallarray.length; i++) {
			System.out.print(smallarray[i]);
			sum = sum + smallarray[i];
		} 

		
	
		//System.out.println(Arrays.toString(massive1));

		System.out.println(" -Sum is " + sum);
	int array[][]=new int[a][a];
		int input =a;
				//smallarray.length-1;
		for(int i = 0; i < input; i++){		
			   for(int j = 0; j < input; j++){
			       array[i][j] = smallarray[(j * input) + i]; 
			   }
		}
		System.out.println("Извеждане на двумерния масив: "+"\n" + Arrays.deepToString(array).replace("], ", "]\n"));
		
	}



}


