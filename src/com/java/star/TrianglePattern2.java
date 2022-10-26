package com.java.star;

public class TrianglePattern2 {

	public static void main(String[] args) {
		
		int i=0,j=0,n=17;
		
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				
							
						if(i== n-1 || j==0 && i>(n-1)/2 ||i-j>=(n-1)/2 ||j==n-1 &&i>(n-1)/2 && i< n-1|| i+j>=n-1+(n-1)/2)
						{
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
				
			}
			
		

			System.out.println();
		}

	}

}
