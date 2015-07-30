public class SinglyLinkedListDeletionFromBegenning{
Node head;
Node tail;

public void insert(int data){
Node n=new Node();
n.setData(data);

if(head==null){
	head=n;
	tail=head;
	tail.setNext(null);
}	

else{
	
	Node temp=tail;
	tail=n;
	tail.setNext(null);
	temp.setNext(tail);
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
	Node temp=head,currentNode,previousNode,nextNode;
	if(temp.getData()==d){
		 nextNode=temp.getNext();
	    head.setNext(null);
		head=nextNode;
	}
	else{
	while(temp!=null){
		if(temp.getNext().getData()==d){
			break;
		}
		temp=temp.getNext();
	}
	previousNode=temp;
	currentNode=temp.getNext();
	nextNode=currentNode.getNext();
	currentNode.setNext(null);
	previousNode.setNext(nextNode);
	}
}



public static void main(String[] args){
SinglyLinkedListDeletionFromBegenning s=new SinglyLinkedListDeletionFromBegenning();
s.insert(2);
s.insert(3);
s.insert(2);
s.insert(4);
s.insert(4);

s.show();

s.delete(4);
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