package com.sushil.springaop;

import java.io.IOException;
import java.sql.SQLDataException;

public class ClassTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		
		ClassTest t = new B();
		try {
			t.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
   void m1 (ClassTest t){
	   System.out.println("hi");
   }
   void m1 () throws Exception{
	   System.out.println("hi1111");
   }
}


class B extends ClassTest{
	void m1 (B t){
		   System.out.println("hi BBBBBBB");
	   }
	
	void m1 () throws IOException,SQLDataException{
		   System.out.println("hi 22222");
	   }
}