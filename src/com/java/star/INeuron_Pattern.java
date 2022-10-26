package com.java.star;

public class INeuron_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,i=0,j=0;
		
		//I Alphabet
		for(i=0;i<n;i++){
			
			for(j=0;j<n;j++){
				
				if(i==0 || i==n-1 || j== n/2){
					System.out.print("*");
				}
					else{
						System.out.print(" ");
					}
			
				
				}
			
			//N Alphabet
			System.out.print(" ");
			for(j=0;j<n;j++){
				
				if(j==0 || j==n-1 || i==j){
					System.out.print("*");
				}
					else{
						System.out.print(" ");
					}
			
				
				}
			
			//E Alphabet
			System.out.print(" ");
			for(j=0;j<n;j++){
				
				if(j==0 ||i==0||i==n-1 ||i== (n-1)/2){
					System.out.print("*");
				}
					else{
						System.out.print(" ");
					}
			
				
				}
			
			
			//U Alphabet
			System.out.print(" ");
			for(j=0;j<n;j++){
				
				if(j==0||i==n-1 ||j==n-1){
					System.out.print("*");
				}
					else{
						System.out.print(" ");
					}
			
				
				}
			
			//R Alphabet
			System.out.print(" ");
			for(j=0;j<n;j++){
				
				if(i==0 && j< n-2 || j==0 || i==(n-1)/2 && j< n-2 || i!=0 && i< (n-1)/2 &&  j==n-2 || j==(i-1) && i>(n-1)/2 )	
				{
					
					System.out.print("*");
				}
				
					else{
						System.out.print(" ");
					}
			
				
				}
			

			System.out.print(" ");
			for(j=0;j<n;j++){
				
				if(j==0||i==n-1 ||j==n-1||i==0){
					System.out.print("*");
				}
					else{
						System.out.print(" ");
					}
				
			
			
				
				}
			
			System.out.print(" ");
			System.out.print(" ");
			for(j=0;j<n;j++){
				
				if(j==0 || j==n-1 || i==j){
					System.out.print("*");
				}
					else{
						System.out.print(" ");
					}
			
				
				}
			System.out.println();
			}
		
		
		
		
	
	
	}		
		
		
		}
		
		

	


