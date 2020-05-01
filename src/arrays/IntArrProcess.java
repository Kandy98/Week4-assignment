package arrays;

import java.util.Arrays;

public class IntArrProcess {

	int size;
	int[] arr = new int[size];
	
	public IntArrProcess() {
		size = 10;
	}
	
	public IntArrProcess(int[] secArray) {
		this.size = secArray.length;
		this.arr = secArray;
	}
	
	public IntArrProcess(IntArrProcess t) {
		this.size = t.size;
		this.arr = t.arr;
	}
	
	public void read() {
		System.out.println("Enter size of the array: ");
		int sz = Scan.sc.nextInt();
		if(sz != 0) 
			size = sz;
		
		System.out.println("Enter elements of the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = Scan.sc.nextInt();
		}
	}
	
	public void display(char ch) {
		System.out.println("print array ? (h/v)");
		if(Character.toLowerCase(ch) == 'h') {
			for(int i=0; i<size; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
		else if(Character.toLowerCase(ch) == 'v') {
			for(int i=0; i<size; i++) {
				System.out.println(arr[i]);
			}
			System.out.println();
		}
	}
	
	public void sort() {
        Arrays.sort(arr, 0, size-1);
	}
	
	public int sum() {
		int sum = 0;
		
		for(int i=0; i<size; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public void largestAndSmallest() {
		int max= -1000000007, min = 1000000007;
		for(int i=0; i<size; i++) {
			if(arr[i]>max)
				max = arr[i];
			
			if(arr[i]<min)
				min = arr[i];
		}
		
		System.out.printf("Largest number: %d, Smallest number: %d", max, min);
		System.out.println();
		
	}
	
	public void secondLargest() {
		int max, max2;
		max = max2 = -100000009;
		
		for(int i=0; i<size; i++) {
			if(arr[i]>=max) {
				max2 = max;
				max = arr[i];
			}
			
			else if(arr[i]>max2)
				max2 = arr[i];
		}
		System.out.printf("Second largest number: %d", max2);
	}

}
