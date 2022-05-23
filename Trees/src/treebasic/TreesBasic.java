package treebasic;

import java.util.*;

//import treebasic;

public class TreesBasic {
	
	static class node{
		int data;
		node left;
		node right;
		node (int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static class BinaryTree {
		static int idx=-1;
		public static node buildtree(int nodes[]) {
			idx++;
			if (nodes[idx]==-1) {
				return null;
			}
			node newnode=new node(nodes[idx]);
			newnode.left=buildtree(nodes);
			newnode.right=buildtree(nodes);
			
			return newnode;
		}
		
		public static void preorder(node root) {
			if (root==null) {
				return;
			}
			System.out.println(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
		public static void inorder(node root) {
		       if(root == null) {
		           System.out.print(-1+" ");
		           return;
		       }
		       inorder(root.left);
		       System.out.print(root.data+" ");
		       inorder(root.right);
		   }
		
		public static void postorder(node root) {
		       if(root == null) {
		           System.out.print(-1+" ");
		           return;
		       }	
		       postorder(root.left);
		       postorder(root.right);
		       System.out.print(root.data+" ");
		   }
		
		public static void levelorder(node root) {
			if (root==null) 
				return;
		
			Queue<node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty()) {
				node cur=q.remove();
				if  (cur==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}
					else
						q.add(null);
				}
				else {
					System.out.print(cur.data+" ");
					if (cur.left!=null)
						q.add(cur.left);
					if (cur.right!=null)
						q.add(cur.right);
				}
			}
		}
		
		public static int height(node root) {
			if (root==null)
				return 0;
			int left=height(root.left);
			int right=height(root.right);
			return (Math.max(left,right)+1);
		}
		
		public static int totalnode(node root) {
			if (root==null)
				return 0;
			int left=totalnode(root.left);
			int right=totalnode(root.right);
			return (left+right+1);
		}
		
		public static int sumnode(node root) {
			if (root==null)
				return 0;
			int left=sumnode(root.left);
			int right=sumnode(root.right);
			return left+right+root.data;
		}
		
		
	}

	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree obj=new BinaryTree();
		node root=obj.buildtree(nodes);
//		System.out.println(root.data);
		int num=obj.sumnode(root);
		System.out.print(num);
		

	}
}
