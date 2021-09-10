public class Stack {
	private int top;
	private int arr[];
	private int capacity;
	private final int MAX = 1000;
	
	public Stack() {
		arr = new int[MAX];
		capacity = MAX;
		top = -1;
	}
	
	public Stack(int size){
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public int currentSize(){
		return top + 1;
	}
	
	public boolean isEmpty(){
		return top < 0;
	}
	
	public boolean isFull() {
		return top == capacity - 1;
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}	
		arr[++top] = x;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		
		return arr[top--];
	}
	
	public int peek() {
		if(!isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return -1;
	}
	
	public void printStack() {
		for (int i = top; i >-1; i--) {
			System.out.println(" "+arr[i]);
		}
	}

	public static void main(String[] args){
		Stack stack = new Stack();

		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.printStack();
		
	}


}


