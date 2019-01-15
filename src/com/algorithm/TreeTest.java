package com.algorithm;

public class TreeTest {
	public static void main(String[] args) {
		// 创建树节点
		TreeNode thNode1 = new TreeNode(10);
		TreeNode thNode2 = new TreeNode(9);
		TreeNode thNode3 = new TreeNode(20);
		TreeNode thNode4 = new TreeNode(15);
		TreeNode thNode5 = new TreeNode(35);
		// 连接节点
		thNode1.setLeftNode(thNode2);
		thNode1.setRightNode(thNode3);
		thNode3.setLeftNode(thNode4);
		thNode3.setRightNode(thNode5);

		// 遍历节点
		// 中序(根->左->右)，先序(左->根->右)，后序(左->右->根)
		// inTraverseBTree(thNode1);
		// preTraverseBTree(thNode1);
		// backTraverseBTree(thNode1);

		// 动态创建二叉树（二叉查找数）
		int[] arrays = { 2, 3, 1, 4, 5 };
		TreeRoot rootNode = new TreeRoot();//树根
		for (int e : arrays) {
			creatTree(rootNode, e);
		}
		inTraverseBTree(rootNode.getTreeRoot());

	}

	/**
	 * 动态创建二叉数（二叉查找树）
	 * 
	 * @param rootNode
	 *            根节点
	 * @param value
	 *            节点值
	 */
	private static void creatTree(TreeRoot treeRoot, int value) {
		// 如果数根为空（第一次访问），将第一个值作为根节点
		if (treeRoot.getTreeRoot() == null) {
			TreeNode node = new TreeNode(value);
			treeRoot.setTreeRoot(node);
		} else {
			// 当前树节点
			TreeNode tempRoot = treeRoot.getTreeRoot();
			while (tempRoot != null) {
				// 当前值大于根值，放在右边
				if (value > tempRoot.getValue()) {
					// 如果右边没有节点直接插入
					if (tempRoot.getRightNode() == null) {
						tempRoot.setRightNode(new TreeNode(value));
						return;
					}else {
						//如果右边有节点，就到右边节点
						tempRoot = tempRoot.getRightNode();
					}
				}
				// 当前值小于根值，放在左边
				else {
					if(tempRoot.getLeftNode()==null){
						//如果左边没有节点，直接插入
						tempRoot.setLeftNode(new TreeNode(value));
						return ;
					}
					else{
						//如果左边有节点，就到左边节点去
						tempRoot = tempRoot.getLeftNode();
					}
				}
			}
		}
	}

	/**
	 * 中序遍历
	 * 
	 * @param rootNode
	 *            根节点
	 */
	public static void inTraverseBTree(TreeNode rootNode) {
		if (rootNode != null) {
			System.out.println(rootNode.getValue());
			inTraverseBTree(rootNode.getLeftNode());
			inTraverseBTree(rootNode.getRightNode());
		}
	}

	/**
	 * 先序遍历
	 * 
	 * @param rootNode
	 *            根节点
	 */
	public static void preTraverseBTree(TreeNode rootNode) {
		if (rootNode != null) {
			preTraverseBTree(rootNode.getLeftNode());
			System.out.println(rootNode.getValue());
			preTraverseBTree(rootNode.getRightNode());
		}
	}

	/**
	 * 后序遍历
	 * 
	 * @param rootNode
	 *            根节点
	 */
	public static void backTraverseBTree(TreeNode rootNode) {
		if (rootNode != null) {
			backTraverseBTree(rootNode.getLeftNode());
			backTraverseBTree(rootNode.getRightNode());
			System.out.println(rootNode.getValue());
		}
	}

}

/**
 * 动态创建二叉查找数所需要的树根类
 * 
 * @author Administrator
 *
 */
class TreeRoot {
	TreeNode treeRoot;

	public TreeNode getTreeRoot() {
		return treeRoot;
	}

	public void setTreeRoot(TreeNode treeRoot) {
		this.treeRoot = treeRoot;
	}

}
