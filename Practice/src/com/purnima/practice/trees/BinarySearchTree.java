package com.purnima.practice.trees;

public class BinarySearchTree {
	
	TreeNode root;

	BinarySearchTree()
	{
		root = null;
	}
	
	public void insert(int num)
	{
		root = insertIntoTree(root, num, 1);
	}
	
	
	
	TreeNode insertIntoTree(TreeNode root2, int value, int position)
	{
		if(root2 == null)
		{
			TreeNode node = new TreeNode(value, position);
					root = node;
					System.out.println(position);
					return root;
		}
		
		else 
		{
			if(value < root2.key)
			{
				root2.left = insertIntoTree(root2.left, value, position*2);
			}
			else
			{
				root2.right = insertIntoTree(root2.right, value, (position*2)+1);
			}
			
			return root2;
		}
		
		
		
	}
	
	public void delete(int num)
	{
	     																
	}
		
	
	/**public TreeNode deleteKey(TreeNode root2, int value)
	{
		if(root==null)
		{
			return root;
		}
		else if(root.key<value)
		{
			root2.left = deleteKey(root2.left, value)
					
		}
		else if(root.key>value)
		{
			root2.right = deleteKey(root2.right, value)
		}
		else
		{
			sysout
		}
	
	}**/
	
	
}
