public class mystack
{
	int max_size;
	int[] arr;
	int top;


	public mystack(int size)
	{
		this.max_size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void increasesize()
	{
		int[] new_arr = new int[this.max_size*2];
		for(int i= 0;i<max_size;i++)
		{
			new_arr[i] = this.arr[i];
		}
		this.arr = new_arr;
		this.max_size = this.max_size*2;
	}

	public void push(int a)
	{
		if(top == max_size-1)
		{
			System.out.println("Stack Full, increasing size");
			this.increasesize();
		}
		top++;
		arr[top] = a;
	}

	public int peek()
	{
		if(top == -1) 
		{
			System.out.println("Nothing in Stack");
			return 0;
		}
		return arr[top];
	}

	public void pop()
	{
		if(top == -1) 
		{
			System.out.println("Nothing in Stack");
			return;
		}
		top--;
	}

	public static void main(String[] args) {
        mystack stack = new mystack(2);
        for(int i=1;i<10;i++){
            stack.push(i);
        }
        for(int i=1;i<15;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

