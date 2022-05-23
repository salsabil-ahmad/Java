package LLPractice1;

public class FirstLList {
	
	private Node head;
	private Node tail;
	private int size;

	private class Node {
		private int value;
		private Node next;
		public Node(int value) {
			this.value = value;
		}
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	public FirstLList() {
		this.size=0;
	}
	
	public void insertfirst(int val) {
		Node node=new Node(val);
		node.next=head;
		head=node;
		if (tail==null) {
			tail=head;
		}
		size++;
	}
	
	public void insertlast(int val) {
		if(tail==null) {
			insertfirst(val);
			return;
		}
		Node node=new Node(val);
		tail.next=node;
		node=tail;
		size++;
	}
	
	public void insert(int val, int index) {
		if (index==0) {
			insertfirst(index);
			return;
		}
		if (index==size) {
			insertlast(index);
			return;
		}
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		Node node=new Node(val,temp.next);
		temp.next=node;
		size++;
	}
	
	public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
	

}
