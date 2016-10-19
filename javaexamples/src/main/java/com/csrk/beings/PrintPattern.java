package com.csrk.beings;

public class PrintPattern {	
	public static void main(String[] args) 
	{
		int i;
		int j;
		for(i=0;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(j); 
			}
			System.out.println("");  
		}	
	System.out.println("---------------");
	
		for(i=0;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*"); 
			}
			System.out.println("");  
		}	
	System.out.println("---------------");
		
	    int k;
		for(i=0;i<5;i++) {
	        for(j=0;j<5-i;j++) {
	            System.out.print(" ");
	        }
	       for(k=0;k<=i;k++) {
	           System.out.print("* ");
	       }
	       System.out.println();  
   }
	
	
	
	
	
	
	
	
	
	}
}