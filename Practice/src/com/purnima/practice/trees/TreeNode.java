package com.purnima.practice.trees;

public class TreeNode {
	
	int position;
	int key;
	TreeNode left;
	TreeNode right;
	
	TreeNode()
	{
		left = right = null;
	}
	
	TreeNode(int key)
	{
		this.key = key;
		left = right = null;
		
	}
	
	TreeNode(int key, int position)
	{
		this.key = key;
		this.position = position;
		left = right = null;
	}
	

}
