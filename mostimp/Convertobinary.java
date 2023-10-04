package top50;

// 45.Create complete Binary Tree from its Linked List
import java.util.*;

// A linked list node
class ListNode
{
	int data;
	ListNode next;
	ListNode(int d)
	{
		data = d;
		next = null;
	}
}

// A binary tree node
class BinaryTreeNode
{
	int data;
	BinaryTreeNode left, right = null;
	BinaryTreeNode(int data)
	{
		this.data = data;
		left = right = null;
	}
}

class BinaryTree
{
	ListNode head;
	BinaryTreeNode root;
	void push(int new_data)
	{
		// allocate node and assign data
		ListNode new_node = new ListNode(new_data);

		// link the old list of the new node
		new_node.next = head;

		// move the head to point to the new node
		head = new_node;
	}
	BinaryTreeNode convertList2Binary(BinaryTreeNode node)
	{
		// queue to store the parent nodes
		Queue<BinaryTreeNode> q =
					new LinkedList<BinaryTreeNode>();

		// Base Case
		if (head == null)
		{
			node = null;
			return null;
		}
		node = new BinaryTreeNode(head.data);
		q.add(node);
		head = head.next;
		while (head != null)
		{
			
			BinaryTreeNode parent = q.peek();
			BinaryTreeNode leftChild = null, rightChild = null;
			leftChild = new BinaryTreeNode(head.data);
			q.add(leftChild);
			head = head.next;
			if (head != null)
			{
				rightChild = new BinaryTreeNode(head.data);
				q.add(rightChild);
				head = head.next;
			}

		
			parent.left = leftChild;
			parent.right = rightChild;

			q.poll();
		}
		
		return node;
	}
	void inorderTraversal(BinaryTreeNode node)
	{
		if (node != null)
		{
			inorderTraversal(node.left);
			System.out.print(node.data + " ");
			inorderTraversal(node.right);
		}
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.push(36); /* Last node of Linked List */
		tree.push(30);
		tree.push(25);
		tree.push(15);
		tree.push(12);
		tree.push(10); /* First node of Linked List */
		BinaryTreeNode node = tree.convertList2Binary(tree.root);

		System.out.println("Inorder Traversal of the"+
						" constructed Binary Tree is:");
		tree.inorderTraversal(node);
	}
}
// This code has been contributed by Mayank Jaiswal
