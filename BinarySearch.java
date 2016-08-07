package Arrayqueue;
import java.util.Scanner;
public class binary_search {

private static Scanner input;
public static void main(String[]args){
		
		int[] array = new int[10];
		int searchValue = 0, upperbound;
		
		System.out.println ("Please enter 10 numbers");
		input = new Scanner (System.in);
		
		for (int i = 0; i < array.length; i++){
			array[i] = input.nextInt();
		}
		
		System.out.println ("Enter a number to search for: ");
		searchValue = input.nextInt();
		upperbound = binarySearch(array, searchValue);
		
		if (upperbound != -1){
			System.out.println ("Found at index: " + upperbound);
		}
		else {
			System.out.println("Not found");
		}
	}
	static int binarySearch (int[] search, int find){
		int start , lowerbound, midpoint;
		start = 0;
		lowerbound = search.length - 1;
		
		while (start <= lowerbound){
			midpoint = (start + lowerbound) / 2;
			
			if (search[midpoint] == find){
				return midpoint;
			}
			else if (search[midpoint] < find){
				start = midpoint + 1;
			}
			else {
				lowerbound = midpoint - 1;
			}
		}
		return -1;
	}
}