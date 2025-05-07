package DsaAssignment07;

import java.util.Scanner; 

class Node { 
    int info; 
    Node next;  

    Node(int data) {
        this.info = data;
        this.next = null;
    }
}

public class LLBasedQueue {

    static Node front = null; 
    static Node rear = null; 

    
    public static void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to insert:");
        int data = sc.nextInt();
        Node newNode = new Node(data);

        if (rear == null) { // If queue is empty
            front = rear = newNode;
            System.out.println("Element " + data + " inserted into the queue.");
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println("Element " + data + " inserted into the queue.");
    }

    // Method to delete an element from the queue 
    public static void delete() {
        if (front == null) { // If queue is empty
            System.out.println("Queue is empty. Cannot delete element.");
            return;
        }
        int element = front.info;
        front = front.next;

        if (front == null) { // If queue becomes empty after deletion
            rear = null;
        }
        System.out.println("Element " + element + " deleted from the queue.");
    }

    // Method to display the elements of the queue
    public static void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Elements in the queue are:");
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        while (true) { 
            System.out.println("\n****MENU****"); 
            System.out.println("0:Exit"); 
            System.out.println("1:Insert"); 
            System.out.println("2:Delete"); 
            System.out.println("3:Display"); 
            System.out.println("Enter your choice"); 
            int choice = sc.nextInt(); 

            switch (choice) { 
                case 0:
                    System.exit(0); 
                case 1:
                    insert(); 
                    break;
                case 2:
                    delete(); 
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Wrong choice"); 
            }
        }
    }
}
