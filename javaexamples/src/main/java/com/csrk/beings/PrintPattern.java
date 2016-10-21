package com.csrk.beings;

public class PrintPattern {	
	public static void main(String[] args) 
	{
		System.out.println("While Loop");
		int i = 1;
		while(i<=5){
			int j = 1;
			while(j<=i){
				System.out.print("*"); 
				j++;
			}
			System.out.println("");  
			i++;
		}	
		System.out.println("For Loop");	
		for(i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
			System.out.print(j);		
			}
		System.out.println("");
		}
		
	    int k = 0;
		for(i=0;i<5;i++) {
	        for(k=0;k<5-i;k++) {
	            System.out.print(" ");
	        }
	       for(int j=0;j<=i;j++) {
	           System.out.print("* ");
	       }
	       System.out.println();  
		}
	
		while(i<=5){
			while(k<5-i){
				System.out.print(" ");
				k++;
			}
			int j = 1;
			while(j<=i){
				System.out.print("*"); 
				j++;
			}
			System.out.println("");  
			i++;
		}	
	
	}
}