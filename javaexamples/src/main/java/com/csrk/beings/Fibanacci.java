package com.csrk.beings;

public class Fibanacci {
	public static void main(String[] args){
		
		System.out.println("Fibanacci Series");
		int i=0,n1=0,n2=1,n3,count=10;    
		// System.out.print(n1+" "+n2);    
		    
		 for(i=2;i<count;++i)
		 { 
		    if(n1==0){
			  System.out.print(n1+" "+n2); 
		 	}
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}
}
