public class SingleLinkedListDisplayFromLast{
private Node head;
private Node tail;

public void insert(int d){
Node n=new Node();
n.setData(d);

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

public void reverseRecursion(Node temp){
	if(temp==null){
		return;
	}
	else{
		reverseRecursion(temp.getNext());
		System.out.print(temp.getData()+" ");
	}
	
}


public static void main(String[] args){
SingleLinkedListDisplayFromLast s=new SingleLinkedListDisplayFromLast();
s.insert(0);
s.insert(9);
s.insert(10);
s.insert(8);
s.insert(7);
s.insert(1);
s.insert(0);
s.insert(4); 
s.show();
s.reverseRecursion(s.head);

}

}