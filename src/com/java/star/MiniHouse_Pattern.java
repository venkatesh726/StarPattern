package com.java.star;

public class MiniHouse_Pattern {

	public static void main(String[] args) {
		
		int i=0,j=0,n=14;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i==0 || i==n-1 ||j==0 ||j==n-1|| i>0 && j<=(n)/2 && i<=((n-1)/2)-j 
						|| i>0  && j>=((n-1)/2) && j-i>=(n)/2){
				System.out.print("*");
				} else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
		}

	}

}
