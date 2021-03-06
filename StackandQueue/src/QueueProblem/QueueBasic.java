package QueueProblem;

public class QueueBasic {
	private int[] data;
	private static final int default_size=10;
	int end=0;
	
	public QueueBasic() {
		this(default_size);
	}

	public QueueBasic(int size) {
		this.data=new int[size];
	}
	
	public boolean isFull() {
		return end==data.length;
	}
	public boolean isEmpty() {
		return end==0;
	}
	
	public boolean insert(int item) {
		if (isFull()) {
			return false;
		}
		data[end++]=item;
		return true;
	}
	
	public int delete() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int remove=data[0];
		for(int i=1;i<data.length;i++) {
			data[i-1]=data[i];
		}
		return remove;
	}
	
	public void display() {
		for (int i=0;i<data.length;i++) {
			System.out.print(data[i]+"<-");
		}
		System.out.println();
	}
}
