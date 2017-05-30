package base;

import java.util.Arrays;

import org.junit.Test;

public class SearchDemo {
	
	@Test
	public void paixu(){
		int[] arr = new int[]{3,5,7,1,6,2};
		for(int i = 0;i < arr.length -1;i++) {
			for(int j = i;j < arr.length;j++){
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void maopao(){
		int[] arr = new int[]{3,5,7,1,6,2};
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr.length - 1 - i;j++){
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void binarySearchTest(){
		int[] arr = new int[]{1,3,5,7,9,11,15};
		int number = 9;
		System.out.println(binarySearch(arr, number));
	}
	public int binarySearch(int[] arr,int number){
		//int[] arr = new int[]{1,3,5,7,9,11,15};
		int min = 0;
		int max = arr.length - 1;
		while (min <= max) {
			int mid = (min + max)/2;
			if (arr[mid] > number) {
				max = mid - 1;
			} else if(arr[mid] < number) {
				min = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	@Test
	public void jiujiu(){
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(j +"*" +i +"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
}
