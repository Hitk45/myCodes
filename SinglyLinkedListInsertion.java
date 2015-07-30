public class SinglyLinkedListInsertion{
  Node head;
	Node tail;

public void add(int data){
	Node n=new Node();
	n.data=data;
	if(head==null){
	n.next=null;
	head=n;
	tail=head;
	}
	else{
		Node temp=tail;
	tail=n;
	tail.next=null;
	temp.next=tail;
	}
}

public void show(){
	Node temp=head;
	while(temp!=null){
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}

public static void main(String[] args){
	
	SinglyLinkedList s=new SinglyLinkedList();
	s.add(5);
	s.add(5);
	s.add(5);
	s.add(5);
	
	s.show();
}

}

class Node{
	int data;
  	Node next;

	
	
}