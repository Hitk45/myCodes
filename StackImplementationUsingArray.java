public class StackImplementationUsingArray{
private int maxSize;
int[] array;
private int top;

public StackImplementationUsingArray(int maxSize){
	this.maxSize=maxSize;
	array=new int[maxSize];
	top=-1;
}

public void push(int data)throws Exception{
if(top==maxSize-1){
	throw new Exception("Stack is full");
}

array[++top]=data;
	
}

public int pop()throws Exception{
	int data;
	if(top<0){
		throw new Exception("Stack is Empty");
	}
     data=array[top];
	top--;
	return data;
}


public int size(){
	return top+1;
	}

public int capacity(){
	return maxSize;
	}
	
	
public boolean isEmpty(){
	return top<0;
}

public int top()throws Exception{
	if(top<0){
		throw new Exception("Stack is Empty");
	}
	return array[top];
}


public String toString(){
	String s="";
for(int i=0;i<=top;i++){
		s=s+array[i]+" ";
	}
	return "["+s+"]";
	}


public static void main(String[] args){
StackImplementationUsingArray s=new StackImplementationUsingArray(10);
try{
	//System.out.println("Top is: "+s.top());
	//System.out.println(s.pop()+" is popped out");
System.out.println("Stack is Empty is: "+s.isEmpty());
s.push(9);
s.push(8);
s.push(1);
s.push(2);
s.push(3);
s.push(4);
s.push(0);
s.push(3);
s.push(4);
s.push(0);
//s.push(7);
System.out.println("Stack is Empty is: "+s.isEmpty());
System.out.println("Size is: "+s.size());
System.out.println("Capacity is: "+s.capacity());
System.out.println("Top is: "+s.top());
System.out.println("Stack elements are: "+s);
System.out.println(s.pop()+" is popped out");
System.out.println("Stack elements are: "+s);
System.out.println(s.pop()+" is popped out");
System.out.println("Stack elements are: "+s);
System.out.println("Size is: "+s.size());
}
catch(Exception e){
	System.out.println(e);
}
}

}