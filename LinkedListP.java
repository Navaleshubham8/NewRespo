class LinkedListP{
	public static Node head;
	public static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void addFirst(int data){
		Node newNode=new Node(data);
		Node current=head;
		if(head==null){
			head=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
	}
	public void addLast(int data){
		Node newNode=new Node(data);
		Node current=head;
		if(current==null){
			current=newNode;
		}
		else{
			while(current.next!=null){
				current=current.next;
			}
			current.next=newNode;
		}
	}
	public void removeAt(int data){
		int j=1;
		Node current=head;
		while(data!=j){
			j++;
			current=current.next;
		}
		current.next=current.next.next;
		
	}
	public void remove(int data){
		
	}
	public void show(){
		Node current=head;
		System.out.print("head-->");
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("Null");
	}
	public void reverse(){
		Node current=head;
		Node pri,next;
		pri=null;
		next=null;
		while(current!=null){
			next=current.next;
			current.next=pri;
			pri=current;
			current=next;
		}
		head=pri;
	}
	public static void main (String[] args){
		LinkedListP obj=new LinkedListP();
		obj.addFirst(1);
		obj.addLast(2);
		obj.addLast(3);
		obj.addLast(4);
		obj.addLast(5);
		obj.addLast(6);
		obj.addFirst(0);
		obj.removeAt(4);
		obj.show();
		//obj.reverse();
		//obj.show();
	}
}