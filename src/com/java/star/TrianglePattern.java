package com.java.star;

public class TrianglePattern {

	public static void main(String[] args) {
		
	int i=0,j=0,n=14;
	
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			
						
					if(i==0||i==n-1||j==0||i+j<=(n-1)/2||i-j>=(n-1)/2){
						System.out.print("*");
					} else     {
						System.out.print("");
					}
			
			
		}
		
	

		System.out.println();
	}

	}

}
