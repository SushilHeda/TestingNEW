package com.sushil.springaop;

public class SushilPratice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Method to get target value in Matrix
		gettargetedvalue();
		
	}
	
	System.out.println("Hello updated");
	
	private static void gettargetedvalue() {

	int target = 8;
	int matrix [][] = new int [][]{
			             {1,  2,   3 , 10},
			             {4 , 5,   6 , 11},
			             {7,  8,   9,  12} };
	
	int m = matrix.length;
	int n = matrix[0].length;
	System.out.println("value of m is "+ m + "value of  n "+ n);
	int start = 0;
	int end = m+n-1;
	System.out.println("end is "+ end);
	
	while(start<=end){
		int mid = (start+end/2);
		System.out.println("mid"+mid);
		int midX= mid/n;
		System.out.println("midX"+midX);
		int midY = mid%n;
		System.out.println("midY"+midY);
		if(matrix[midX][midY]==target){
			System.out.println("middle value");
			break;
		}
		if(matrix[midX][midY]<target){
			start = mid+ 1;
		}else{
			end = mid-1;
		}
	}
}


}

