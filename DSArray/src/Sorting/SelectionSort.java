package Sorting;

public class SelectionSort {
	
	void selection(int a[]) {
		int len=a.length;
		for (int i=0;i<len-1;i++) {
			int min=i;
			for (int j=i+1;j<len;j++) 
				if (a[j]<a[min])
					min=j;
				
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
	
	void printarray(int a[]){
		int len=a.length;
		for (int i=0;i<len;i++) 
			System.out.print(a[i]+" ");
		
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort obj=new SelectionSort();
		int arr[]= {23,14,56,34,23,99,43,11};
		obj.selection(arr);
		System.out.println("sorted Array -");
		obj.printarray(arr);
	}
}
