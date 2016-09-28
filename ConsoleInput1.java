package com.felight.myApp;

import java.util.Scanner;



public class ConsoleInput1 {

		private static Scanner in;

			public static void main(String[] args) {
				System.out.println("Enter the size of Array: ");
				in = new Scanner(System.in);
				int size1 = in.nextInt();
				
				//int[] array = new int[size];
				if(size1==0 || size1<0){
					System.out.println("Enter a valid number ");
					
				}
				else
					Validate1.validate(size1);	
				
				
			}

		}



	
