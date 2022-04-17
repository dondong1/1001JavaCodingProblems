package testing;


import java.io.IOException;
import java.util.Scanner;

public class NodeInsertLinkedList {
	

	static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
	static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

	 public void insertNode(int nodeData) {
         SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

         if (this.head == null) {
             this.head = node;
         } else {
             this.tail.next = node;
         }

         this.tail = node;
     }
 }

    
        public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) throws IOException {
            while (node != null) {
              

                node = node.next;

                if (node != null) {
              
                }
            }
        }
        
        
	static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
		SinglyLinkedListNode current_node = head;
		int index = 0; 
		
		while (index <position -1) {
			current_node = current_node.next;
			index++;
			
		}
		new_node.next = current_node.next;
		current_node.next = new_node;
		return head;
		
	}
	
	   private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	       
	        SinglyLinkedList llist = new SinglyLinkedList();

	        int llistCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < llistCount; i++) {
	            int llistItem = scanner.nextInt();
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            llist.insertNode(llistItem);
	        }

	        int data = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int position = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

	       System.out.println(insertNodeAtPosition(llist_head,data,position));
	       System.out.println(llist);



	        scanner.close();
	    }
	}
