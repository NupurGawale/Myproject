package com.felight.myApp;

public class Sorting {

	public static void selection(int[] array){	
		int temp,i,j;
	//	long time1 = 0;
		long startTime = System.currentTimeMillis();
		for(i=0;i<array.length-1;i++){
			int min = i;
			for(j=i+1;j<array.length;j++){
				if(array[min] > array[j]){
					min = j;
				}	
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		long endTime = System.currentTimeMillis();	
		long time1 = endTime - startTime;
		System.out.println("Time is: "+ time1 + " milli second");
//		benchmarkSelection(time1);
//		return array;
		
	}
	
	static void benchmarkSelection(long time){
		System.out.println("Time is: "+ time + " milli second");
	}
	
	public static void bubble(int[] array1){
		int temp1;
		long startTime = System.currentTimeMillis();
		for(int j=1;j<array1.length;j++){
			for(int i=array1.length-1;i>=j;i--){
				if(array1[i-1]>array1[i]){
					temp1 = array1[i-1];
					array1[i-1] = array1[i];
					array1[i] = temp1;
				}
			}
		}
		long endTime = System.currentTimeMillis();	
		long time2 = endTime - startTime;
		System.out.println("Time is: "+ time2 + " milli second");
//		benchmarkBubble(time2);
//		return array1;
	}
	
	static void benchmarkBubble(long time){
		System.out.println("Time is: "+ time + " milli second");
	}
	
	public static void insertion(int[] array){
		int j = 0,temp=0;
		long startTime = System.currentTimeMillis();
		for(int i=1;i<array.length;i++){
			temp = array[i];
			j = i-1;
			while(j!=0 && array[j]>temp){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}	
		long endTime = System.currentTimeMillis();	
		long time3 = endTime - startTime;
	//	benchmarkInsertion(time3);
		System.out.println("Time is: "+ time3 + " milli second");
//		return array;
	}	
	
	static void benchmarkInsertion(long time){
		System.out.println("Time is: "+ time + " milli second");
	}
}
