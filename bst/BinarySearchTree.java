package bst;



import java.util.ArrayList;
import java.util.Scanner;

	public class BinarySearchTree {
		

 ArrayList<Integer>list=new ArrayList<>();
	public static void main (String[]args) {
	BinarySearchTree bst =new BinarySearchTree();
	Node root =null;
	Node nn =null;
	Scanner sc = new Scanner(System.in);
	System.out.println(" please enter number of node:");
	int size= sc.nextInt();
	int i;
	for (i= 1;i<=size;i++)
	{
		System.out.println(" please enter data for the node:");
		int item=sc.nextInt();
		nn= new Node(item);
		if(root== null)
			root=nn; 
		else 
			bst.insert(root,nn);
	} 
	System.out.  println(" \nInorder traversal : ");
	bst.inOrder(root);
	
	System.out.println(bst.list);
	System.out.println(" please enter the sum");
	int sum =sc.nextInt();
	int flag=0;
	for(i=0;i<bst.list.size();i++)
	{
		int n1 = bst.list.get(i);
		
		int n2 = sum-n1;
		if(bst.list.contains(n2))
		{
			System.out.println(" found");
			flag=1;
			System.out.println("["+n1+","+n2+"]");
			break;
			
		} 
		if (flag==0)
			System.out.println(" No elements found");
	}
	}
	
	private void inOrder(Node root) {
		if(root!= null)
		{
			inOrder(root.left);
			list.add(root.data );
			inOrder(root.right);
		}
		
	}


	private void insert(Node root, Node nn) {
		
		if(nn.data>root.data)	
		{
			if(root.right==null)
				
			{
				root.right=nn;
			}
			else
			{
			insert(root.right,nn);	
			}
		}
		
		else
		{
			if(root.left==null)
			{
				root.left=nn;
			}
			else
			{
			insert(root.left,nn );	
			}
		}
		}
		}
		
	
	
		
	
