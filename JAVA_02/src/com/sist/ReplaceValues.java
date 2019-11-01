package com.sist;
/**
 * °ª ±³È¯
 * int x = 7;
 * int y = 9;
 * 
 * x = 9;
 * y = 7;
 * @author sist1
 *
 */
public class ReplaceValues {

	public static void main(String[] args) {
		 int x = 7;
		 int y = 9;
		 int tmp;
		 
		 System.out.println("----------------");
		 System.out.println("x="+x+","+"y="+y);
		 System.out.println("----------------");
		 
		 tmp = x;
		 x   = y;
		 y   = tmp;
		 
		 System.out.println("----------------");
		 System.out.println("x="+x+","+"y="+y);
		 System.out.println("----------------");
	}

}
