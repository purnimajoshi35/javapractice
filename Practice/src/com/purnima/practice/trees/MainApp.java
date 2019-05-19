package com.purnima.practice.trees;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainApp {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BinarySearchTree bst = new BinarySearchTree();
		
		try {
			
			int loop = Integer.parseInt(br.readLine().trim());
			
			
			String []str = new String[loop];
			
			for(int i=0; i<loop; i++) {
				
				String operation_num = br.readLine();
				
				operation_num.trim();
				
				String []token = operation_num.split(" ");
				
				str[i] = operation_num;
				
				
			}
			
			for(int i=0; i<loop; i++)
			{
				StringTokenizer stk = new StringTokenizer(str[i]+" ");
				
				while(stk.hasMoreTokens())
				{
					String opr = stk.nextToken();
					//System.out.println("opr is "+opr);
					Integer num = Integer.parseInt(stk.nextToken());
					//System.out.println("num is "+num);
					
					if(opr.equals("i"))
					{
						bst.insert(num);
						
					}
					else if(opr.equals("d"))
					{
						bst.delete(num);
					}
					else
					{
						System.out.println("Invalid Operation");
					}
							
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
