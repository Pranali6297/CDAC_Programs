//LevelWise Traversal,
//print Leaf node
//Print Mirror image Image of Given Tree
//Identify the two treess are identical or not
//Write 
package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelTree {

	public static void main(String[] args) {

		binaryTree bt = new binaryTree();
		bt.insert(10);
		bt.insert(20);
		bt.insert(30);
		bt.insert(40);
		bt.insert(50);
		bt.insert(60);
		bt.insert(70);
		bt.insert(80);
		bt.insert(90);
		
		binaryTree bt1 = new binaryTree();
		bt1.insert(10);
		bt1.insert(20);
		bt1.insert(30);
		bt1.insert(40);
		bt1.insert(50);
		bt1.insert(60);
		bt1.insert(70);
		bt1.insert(80);
		bt1.insert(90);

		System.out.println("Level traversal..");
		bt.leveldisplay();
		
		System.out.println("\nLeaf node..");
		bt.leafnodes();
		
		bt.mirror_image();
		System.out.println("\nMirror image");
		bt.leveldisplay();
		
		System.out.println("\nTwo Tress are identical or not :");
		boolean Result = binaryTree.isIdentical(bt,bt1);
		if(Result == true)
			System.out.println("Yes Identical...");
		else
			System.out.println("No.. Both Are Different");
		
	}

}

class BTNode
{
	BTNode left;
	int data;
	BTNode right;

	public BTNode(int d)
	{
		data = d;
		left = null;
		right = null;
	}

	public BTNode(BTNode d)
	{
		data = d.data;
		left = d.left;
		right = d.right;
	}
}

class binaryTree
{
	BTNode root;

	public void insert(int key)//from function call key is passed to insert
	{
		BTNode newnode = new BTNode(key);//BTNode of first element is created
		Queue<BTNode> q = new LinkedList<BTNode>();//Queue of BTNode is created

		if(root == null)
		{
			root = newnode;//10
			return;
		}

		BTNode temp = root;
		q.add(temp);//added into queue //10 is add at root position
		while(!q.isEmpty())//if Queue is not empty
		{
			temp=q.remove();//
			if(temp.left == null)
			{
				temp.left = newnode;
				break;
			}
			else
				q.add(temp.left);
			
			if(temp.right == null)
			{
				temp.right = newnode;
				break;
			}
			else
				q.add(temp.right);
		}
	}
	public void leveldisplay()
	{
		BTNode temp = root;
		Queue<BTNode> q = new LinkedList<BTNode>();

		if(temp == null)
		{
			System.out.println("Tree is Empty");
			return;
		}

		q.add(temp);
		while(!q.isEmpty())
		{
			temp=q.remove();
			System.out.print(temp.data+" ,");
			if(temp.left != null)
			{
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				q.add(temp.right);
			}
		}
	}
	public void leafnodes()
	{
		BTNode temp = root;
		Queue<BTNode> q = new LinkedList<BTNode>();

		if(temp == null)
		{
			System.out.println("Tree is Empty");
			return;
		}

		q.add(temp);
		while(!q.isEmpty())
		{
			temp=q.remove();
			if(temp.left == null && temp.right==null)
				System.out.print(temp.data+" ");
			if(temp.left != null)
			{
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				q.add(temp.right);
			}
		}
	}
	
	public static void swap(BTNode p)
	{
		BTNode t;
		t =p.left;
		p.left = p.right;
		p.right = t;
	} 

	public void mirror_image()
	{
		BTNode temp = root;
		Queue<BTNode> q = new LinkedList<BTNode>();
		
		if(temp == null)
		{
			System.out.println("Tree is Empty");
			return;
		}
		
		q.add(temp);
		while(!q.isEmpty())
		{
			temp=q.remove();
			swap(temp);
			//System.out.println(temp.data+" ");
			if(temp.left != null)
			{
				q.add(temp.left);
			}
			if(temp.right != null)
			{
				q.add(temp.right);
			}
		}
		}
	
	public static boolean isIdentical(binaryTree t1, binaryTree t2)
	{
		BTNode ptr1 = t1.root;
		BTNode ptr2 = t2.root;
		
		if((ptr1 == null)||(ptr2 == null))
			return false;
		
		Queue<BTNode> q1 = new LinkedList<BTNode>();
		Queue<BTNode> q2 = new LinkedList<BTNode>();
		
		q1.add(ptr1);
		q2.add(ptr2);
		
		while((!q1.isEmpty()) && (!q2.isEmpty()))
		{
			ptr1=q1.remove();
			ptr2 = q2.remove();
			if(ptr1.data != ptr2.data)
				return false;
			
			if(ptr1.left != null)
				q1.add(ptr1.left);
			if(ptr1.right != null)
				q1.add(ptr1.right);
			
			if(ptr2.left != null)
				q2.add(ptr2.left);
			if(ptr2.right != null)
				q2.add(ptr2.right);
		}
		if((q1.isEmpty()) && (q2.isEmpty()))
				return true;
		else 
			return false;
	}
}
