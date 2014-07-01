package com.sushil.springaop;

public class SushilPrograms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] multi = new int[][]{
				  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				  { 0, 0, 0, 0, 0, 0, 0, 4, 0, 0 },
				  { 0, 0, 5, 0, 0, 0, 0, 0, 0, 0 },
				  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				  { 0, 0, 0, 0, 0, 0, 3, 0, 0, 0 }
				};
	 // print(array);
		System.out.println("multi.length"+ multi[0].length);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++){
				if(multi[i][j]==3){
					System.out.println(i +"and"+j);
				}
			}
			
		}
	 // getduplicateNum(array);
	}

	private static void getduplicateNum(int[] array) {
		double number = array.length-1;
		double total = getsum(array);
		double tot= number + 1;
		double dupnum = total-(number*(tot/2));
		System.out.println("dupnum is "+ dupnum);
	}

	private static int getsum(int[] array) {
		int sum=0;
		for(int chr: array){
			sum +=chr;
		}
		return sum;
	}
	
	private static void  print(int[] array) {
		
		for(int chr: array){
			int div= chr/10;
			if(div== (chr%10)){
				System.out.println(chr);
			}
		}
		
	}
	
	
	

}
