package LinkedList;

public class LinkedList {

	static void className() {
		System.out.println("LinkedList");
	}

	class Link {
		int data;
		Link next;

		Link(int data, Link next) {
			this.data = data;
			this.next = next;
		}

		void displayLink() {
			System.out.println("{ data: " + data + ", next: " + next + " }");
		}
	}

	Link first;

	LinkedList() {
		first = null;
	}

	boolean isEmpty() {
		return (first == null);
	}

	void insertFirst(int data) {
		first = new Link(data, this.first);
	}

	Link deleteFirst() {
		if (isEmpty())
			return null;
		Link temp = first;
		first = first.next;
		System.out.print("deleted: ");
		temp.displayLink();
		return temp;
	}

	void displayList() {
		Link current = first;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	Link find(int data) {
		if (isEmpty())
			return null;
		Link current = first;
		while (current != null && current.data != data) {
			current = current.next;
		}
		
		if(current != null) {
			System.out.print("found: ");
			current.displayLink();
		} else {
			System.out.println("element Not found");
		}
		
		return current;
	}

	Link delete(int data) {
		if (isEmpty())
			return null;
		
		Link current = first, prev = current;
		while (current != null && current.data != data) {
			prev = current;
			current = current.next;
		}
		
		if (current != null) {
			prev.next = current.next;
			System.out.print("deleted: ");
			current.displayLink();
		} else {
			System.out.println("element Not found");
		}
			
		return current;
	}

	public static void main(String args[]) {
		className();
		LinkedList list = new LinkedList();

		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(4);
		list.insertFirst(0);
		list.insertFirst(9);
		list.insertFirst(8);

		//list.deleteFirst();

		list.find(12);
		list.delete(1);
		list.delete(9);

		list.displayList();
	}
}
