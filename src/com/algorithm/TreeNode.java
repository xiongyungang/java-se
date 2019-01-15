package com.algorithm;
/*
 * Ê÷½Úµã
 */
public class TreeNode {
	private TreeNode leftNode;
	private TreeNode rightNode;
	private int value;
	
	public TreeNode(int value){
		this.value=value;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
