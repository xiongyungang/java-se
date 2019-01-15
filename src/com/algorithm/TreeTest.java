package com.algorithm;

public class TreeTest {
	public static void main(String[] args) {
		// �������ڵ�
		TreeNode thNode1 = new TreeNode(10);
		TreeNode thNode2 = new TreeNode(9);
		TreeNode thNode3 = new TreeNode(20);
		TreeNode thNode4 = new TreeNode(15);
		TreeNode thNode5 = new TreeNode(35);
		// ���ӽڵ�
		thNode1.setLeftNode(thNode2);
		thNode1.setRightNode(thNode3);
		thNode3.setLeftNode(thNode4);
		thNode3.setRightNode(thNode5);

		// �����ڵ�
		// ����(��->��->��)������(��->��->��)������(��->��->��)
		// inTraverseBTree(thNode1);
		// preTraverseBTree(thNode1);
		// backTraverseBTree(thNode1);

		// ��̬�����������������������
		int[] arrays = { 2, 3, 1, 4, 5 };
		TreeRoot rootNode = new TreeRoot();//����
		for (int e : arrays) {
			creatTree(rootNode, e);
		}
		inTraverseBTree(rootNode.getTreeRoot());

	}

	/**
	 * ��̬�����������������������
	 * 
	 * @param rootNode
	 *            ���ڵ�
	 * @param value
	 *            �ڵ�ֵ
	 */
	private static void creatTree(TreeRoot treeRoot, int value) {
		// �������Ϊ�գ���һ�η��ʣ�������һ��ֵ��Ϊ���ڵ�
		if (treeRoot.getTreeRoot() == null) {
			TreeNode node = new TreeNode(value);
			treeRoot.setTreeRoot(node);
		} else {
			// ��ǰ���ڵ�
			TreeNode tempRoot = treeRoot.getTreeRoot();
			while (tempRoot != null) {
				// ��ǰֵ���ڸ�ֵ�������ұ�
				if (value > tempRoot.getValue()) {
					// ����ұ�û�нڵ�ֱ�Ӳ���
					if (tempRoot.getRightNode() == null) {
						tempRoot.setRightNode(new TreeNode(value));
						return;
					}else {
						//����ұ��нڵ㣬�͵��ұ߽ڵ�
						tempRoot = tempRoot.getRightNode();
					}
				}
				// ��ǰֵС�ڸ�ֵ���������
				else {
					if(tempRoot.getLeftNode()==null){
						//������û�нڵ㣬ֱ�Ӳ���
						tempRoot.setLeftNode(new TreeNode(value));
						return ;
					}
					else{
						//�������нڵ㣬�͵���߽ڵ�ȥ
						tempRoot = tempRoot.getLeftNode();
					}
				}
			}
		}
	}

	/**
	 * �������
	 * 
	 * @param rootNode
	 *            ���ڵ�
	 */
	public static void inTraverseBTree(TreeNode rootNode) {
		if (rootNode != null) {
			System.out.println(rootNode.getValue());
			inTraverseBTree(rootNode.getLeftNode());
			inTraverseBTree(rootNode.getRightNode());
		}
	}

	/**
	 * �������
	 * 
	 * @param rootNode
	 *            ���ڵ�
	 */
	public static void preTraverseBTree(TreeNode rootNode) {
		if (rootNode != null) {
			preTraverseBTree(rootNode.getLeftNode());
			System.out.println(rootNode.getValue());
			preTraverseBTree(rootNode.getRightNode());
		}
	}

	/**
	 * �������
	 * 
	 * @param rootNode
	 *            ���ڵ�
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
 * ��̬�����������������Ҫ��������
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
