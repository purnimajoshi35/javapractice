package com.purnima.practice.trees;

import java.util.StringTokenizer;

public class StringTokennizerTest {

	public static void main(String[] args) {
		
		String str = "i 2 3 4 q 8 3 5 w 6";
		
		StringTokenizer stkr = new StringTokenizer(str);
		
		while(stkr.hasMoreTokens())
		{
			String s = stkr.nextToken();
			System.out.println("s is "+s);
			
			
			int i = Integer.parseInt(stkr.nextToken());
			System.out.println("i is "+i);
		}

	}

}
