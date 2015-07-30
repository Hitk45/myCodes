public class SingleLinkedListDeletionFromEnd{
private Node head;
private Node tail;
public void insert(int d){
	Node n=new Node();
	n.setData(d);
	if(head==null){
		head=n;
		tail=n;
		tail.setNext(null);
	}
	else{
		Node temp=tail;
		tail=n;
		temp.setNext(tail);
		tail.setNext(null);
	}
}

public void show(){
	Node temp=head;
	while(temp!=null){
		System.out.print(temp.getData()+" ");
		temp=temp.getNext();
	}
		System.out.println();
}


public void delete(int d){
	Node temp=head,currentNode=null,nextNode=null,previousNode=null;
	while(temp.getNext()!=null){
		if(temp.getNext().getData()==d){
			previousNode=temp;
			currentNode=temp.getNext();
			nextNode=currentNode.getNext();
		}
		temp=temp.getNext();
	}
	
	if(currentNode==null){
		if(head.getData()==d){
			temp=head;
			currentNode=temp;
			nextNode=temp.getNext();
			currentNode.setNext(null);
			head=nextNode;
		}
	}
	else{
	currentNode.setNext(null);
	previousNode.setNext(nextNode);
	}
	
}

public static void main(String[] args){
SingleLinkedListDeletionFromEnd s=new SingleLinkedListDeletionFromEnd();
s.insert(2);
s.insert(3);
s.insert(5);
s.insert(4);
s.insert(9);
s.insert(4);

s.show();
s.delete(8);
s.show();
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