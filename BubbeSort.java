import java.util.Scanner;
import java.util.Random;
public class BubbeSort {

	public static void main (String[] args){
	
		int size, x, y, swap, array[];
		
		Scanner input = new Scanner (System.in); 
		Random rand = new Random ();

		System.out.println("Enter array size to sort: ");
		size = input.nextInt();
	
		array = new int [size];
		for (int i = 0; i < array.length; i++ ){
		array [i] = rand.nextInt(1000);
		
		}
		System.out.println();
		System.out.println(size + " random numbers generated ");
		
		for (x = 0; x < size; x++){
			array [x] = rand.nextInt(1000);
			System.out.print(array[x] + " ");
			
		}
		
		System.out.println();
		for (x=0; x < size -1; x++){
			for (y = 0; y< size -x -1; y++){
				
				if (array[y] > array[y+1]){
					swap = array [y];
					array[y] = array [y+1];
					array[y+1] = swap;
				}
			}
		}
		System.out.println();
		System.out.println("Bubble Sorting... Done! ");
		for (x = 0; x < size ; x++){
			System.out.print(array [x] + " ");
		}
	}
	
}
