package com.felight.myApp;
import java.util.Scanner;

public class Validate1 {

	private static Scanner in;

		public static void validate(int size1){
		
		in = new Scanner(System.in);
		int i=0;
		
		int[] array = new int[size1];
		
		System.out.println("Array of Size "+size1+" is generated. Now Choose complexity: \n 1.Best Case Scenario \n 2.Average Case Scenario \n 3.Worst Case Scenario ");
		
		int ch = in.nextInt();
		
		switch(ch){
		
		case 1: 
			for(i=0;i<size1;i++){
				array[i]=i;
			}
			for(i=0;i<size1;i++)
				System.out.println(array[i]);
			break;
			
		case 2 : 
			for(i=0;i<size1;i++){
				array[i]=(int)(Math.random()*100);
			}
			for(int num:array)
				System.out.println(num);	
			break;
			
		case 3 : 
			int j = size1;
			for(i=0;i<size1;i++){
				array[i]=j--;
			}
			for(int num:array)
				System.out.println(num);		
			break;
		
		default: 
			System.out.println("Give a correct input: ");
		}
		

		System.out.println("Array of Size"+size1+" is generated. Now generate Case scenario: \n 1.Bubble Sort "
				+ "\n 2.Selection Sort \n 3.Insertion Sort \n 4. All Sorting");
		
		int[] array2 = array.clone();
		int[] array3 = array.clone();
		int[] array4 = array.clone();
		
		int choice  = in.nextInt();
		
		switch(choice){
		case 1 : if(choice==1){
					Sorting.bubble(array);
				
			}
			break;
			
		case 2 : if(choice==2){
					Sorting.selection(array);
				
			}
			break;
			
		case 3:
			if (choice == 3) {

				Sorting.insertion(array);

			}
			break;

			case 4:
				if (choice == 4) {
					Runnable obj = new Runnable() {
						public void run() {
							Sorting.selection(array2);

						}
					};
					Thread t1 = new Thread(obj);

					Runnable obj1 = new Runnable() {
						public void run() {
							Sorting.bubble(array3);

						}
					};
					Thread t2 = new Thread(obj1);

					Runnable obj2 = new Runnable() {
						public void run() {
							Sorting.insertion(array4);

						}
					};
					Thread t3 = new Thread(obj2);

					t1.start();
					t2.start();
					t3.start();
				}
			}
		}
	}


