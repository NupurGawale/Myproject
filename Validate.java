package com.felight.myApp;

import java.util.Scanner;

public static void Validate(int size){
	
	
	System.out.println("Enter the Array Size ");
	int i=0;
	int[] array=new int[size];
	Scanner in=new Scanner(System.in);
	int size=in.nextInt();
	System.out.println("Size of Array " + size "\n Now choose the complexity" );
	System.out.println("1. Best Case Scenario");
	System.out.println("2. Avg Case Scenario");
	System.out.println("3. Worst Case Scenario");
	
	int ch=in.nextInt();
	
	switch(ch){
	case 1:
		for(int i=0;i<size;i++){
			array[i]=i;
		}
		for(int num:array)
			System.out.println(num);
	break;
	
	case 2:
		for(int i=0;i<size;i++){
			array[i]=(int)(Math.random()*100);
		}
		for(int num:array)
			System.out.println(num);
	break;

   case 3:
	   for(int i=0;i<size;i++){
		   array[i]=size--;
	   }
	   for(int num:array)
		   System.out.println(num);
	   
   break;
   
   System.out.println("\n 1. Bubble Sort \n2. Insertion Sort \n3.Selection Sort ");
   
   
}