public class StackImplementationUsingLinkedList{
private Node top;
private Node tail;
private int length=0;

public void push(int data){
	Node n=new Node();
	n.setData(data);
	if(top==null){
		top=n;
		tail=n;
		tail.setNext(null);
		length++;
	}
	else{
		Node temp=top;
		top=n;
		top.setNext(temp);
		length++;
	}
	
}

public int pop()throws Exception{
	Node temp=top.getNext();
	if(length==0){
		throw new Exception("Stack is Empty ");
	}
	int d=top.getData();
	top=temp;
	length--;
	return d;
}

public int peek()throws Exception{
	if(top==null)
		throw new Exception("Stack is Empty");
	return top.getData();
}


public int size()throws Exception{
	if(length==0){
		throw new Exception("Stack is Empty");
	}
	return length;
}


public boolean isEmpty(){
	return length==0;
}


public String toString(){
	String s="";
	Node temp=top;
	while(temp!=null){
		s=s+temp.getData()+" ";
		temp=temp.getNext();
	}
	return "[ "+s+"]";
}

public static void main(String[] args){
StackImplementationUsingLinkedList s=new StackImplementationUsingLinkedList();
try{
System.out.println("Stack is Empty: "+s.isEmpty());	
s.push(1);
s.push(2);
s.push(3);
s.push(4);
s.push(5);
System.out.println("Stack is Empty: "+s.isEmpty());
System.out.println("Size of Stack is: "+s.size());
System.out.println("Elements of Stack are: "+s);
System.out.println("First Element of Stack is: "+s.pop());
System.out.println("Elements of Stack are: "+s);
System.out.println("Size of Stack is: "+s.size());
System.out.println("First Element of Stack is: "+s.peek());
System.out.println("Elements of Stack are: "+s);
}
catch(Exception e){
	System.out.println(e);
}

}

}


class Node{
	private int data;
	private Node next;
	
	public void setData(int data){
	this.data=data;	
	}
	public void setNext(Node next){
		this.next=next;
	}
	public int getData(){
		return data;
	}
	public Node getNext(){
		return next;
	}
	
}