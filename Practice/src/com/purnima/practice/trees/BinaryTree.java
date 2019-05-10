package com.purnima.practice.trees;

public class BinaryTree {
	
	Node root;
	
//	BinaryTree(int key)
//	{
//		root = new Node(key);
//	}
	
	BinaryTree()
	{
		root = null;
	}

	
	void preorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.key+" ");
		
	    preorder(root.left);
	    preorder(root.right);
	}
	
	
	void postorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		
		System.out.print(root.key+" ");
		
	}
	
	void inorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		inorder(root.left);
		System.out.print(root.key+" ");
		
		inorder(root.right);
		
		
	}
	
}
