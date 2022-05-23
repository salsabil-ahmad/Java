
package StackProblems;

public class StackBasic {

	protected int[] data;
	private static final int default_size=10;
	int ptr=-1;
	
	public StackBasic(){
		this(default_size);
	}

	public StackBasic(int size) {
		this.data= new int[size];
	}
	
	public boolean push(int item) {
		if (isFull()) {
			System.out.println("stack is full!!");
			return false;
		}
		ptr++;
		data[ptr]= item;
		return true;
	}
	public boolean isFull() {
		return ptr==data.length;
	}
	
	public int pop() throws StackException{
		if (isEmpty()) {
			throw new StackException("Cannot pop from empty stack");
		}
		return data[ptr--];
	}
	public Boolean isEmpty() {
		return ptr==-1;
	}
	
	public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

}
