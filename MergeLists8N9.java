package com.apex.session.advanced.assignment;

class ListNode {

	int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
		next = null;
	}
}

public class MergeLists8N9 {

	static ListNode head;
	static ListNode head1;
	static ListNode head2;
	static ListNode head3;

	public static void main(String[] args) {

		head1 = new ListNode(2);
		head1.next = new ListNode(4);
		head1.next.next = new ListNode(6);

		head2 = new ListNode(3);
		head2.next = new ListNode(5);
		head2.next.next = new ListNode(7);

		head3 = new ListNode(1);
		head3.next = new ListNode(2);
		head3.next.next = new ListNode(2);
		head3.next.next.next = new ListNode(3);
		head3.next.next.next.next = new ListNode(3);
		head3.next.next.next.next.next = new ListNode(4);

		printList(head1);
		printList(head2);

		ListNode mergenode = mergeSortedList(head1, head2);

		printList(mergenode);

		ListNode uniquelist = removeDuplicates(head3);

		printList(uniquelist);

	}

	private static ListNode removeDuplicates(ListNode head) {

		if (head == null)
			return null;
		if (head.next == null)
			return head;

		ListNode curr = head;
		ListNode prev = curr;
		while (curr.next != null) {
			
			if (curr.data == curr.next.data) {
				prev.next = curr.next;
			}
			prev = curr;
			curr = curr.next;
		}
		return head;

	}

	private static ListNode mergeSortedList(ListNode head1, ListNode head2) {

		if (head1 == null && head2 == null)
			return null;

		if (head1 == null)
			return head2;

		if (head2 == null)
			return head1;

		// Newnode is created withh dummy value
		ListNode newnode = new ListNode(0);
		// Second node is created as we need to return the head of the new node
		ListNode tailnode = newnode;

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				tailnode.next = head1;
				head1 = head1.next;
			} else {
				tailnode.next = head2;
				head2 = head2.next;
			}

			tailnode = tailnode.next;
		}
		while (head1 != null) {
			tailnode.next = head1;
			head1 = head1.next;

		}
		while (head2 != null) {
			tailnode.next = head2;
			head2 = head2.next;
		}

		return newnode.next;

	}

	private static void printList(ListNode head) {
		if (head == null)
			return;

		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println();

	}

	public static void addToTheLast(ListNode node) {
		if (head == null) {
			head = node;
		} else {
			ListNode temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;

		}

	}

}
