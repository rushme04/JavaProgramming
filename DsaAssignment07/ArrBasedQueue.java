package DsaAssignment07;

import java.util.Scanner;

public class ArrBasedQueue {

    public static final int MAX = 5;
    public static int front = -1; // [cite: 10]
    public static int rear = -1; // [cite: 10]
    public static int queue[] = new int[MAX]; // [cite: 11]

    // Method to check if the queue is full [cite: 5]
    public static boolean is_full() {
        return (rear == MAX - 1 && front == 0) || (rear + 1 == front);
    }

    // Method to check if the queue is empty [cite: 6]
    public static boolean is_empty() {
        return front == -1;
    }

    // Method to insert an element into the queue [cite: 5]
    public static void insert(int Q[]) {
        if (is_full()) {
            System.out.println("Queue is full. Cannot insert element.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to insert:");
        int element = sc.nextInt();
        if (front == -1) { // If queue is initially empty
            front = 0;
        }
        rear = (rear + 1) % MAX;
        Q[rear] = element;
        System.out.println("Element " + element + " inserted into the queue.");
    }

    // Method to delete an element from the queue [cite: 5]
    public static void delete(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue is empty. Cannot delete element.");
            return;
        }
        int element = Q[front];
        if (front == rear) { // If queue has only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
        System.out.println("Element " + element + " deleted from the queue.");
    }

    // Method to display the elements of the queue [cite: 5]
    public static void display(int Q[]) {
        if (is_empty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Elements in the queue are:");
        int i = front;
        if (front <= rear) {
            while (i <= rear) {
                System.out.print(Q[i] + " ");
                i++;
            }
        } else {
            while (i <= MAX - 1) {
                System.out.print(Q[i] + " ");
                i++;
            }
            i = 0;
            while (i <= rear) {
                System.out.print(Q[i] + " ");
                i++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // [cite: 9, 11]

        while (true) { // [cite: 11]
            System.out.println("\n***MENU***"); // [cite: 11]
            System.out.println("0: Exit"); // [cite: 11]
            System.out.println("1: Insert"); // [cite: 11]
            System.out.println("2: Delete"); // [cite: 11]
            System.out.println("3: Display"); // [cite: 11]
            System.out.println("4: Check if Full");
            System.out.println("5: Check if Empty");
            System.out.println("Enter your choice"); // [cite: 11]
            int choice = sc.nextInt(); // [cite: 11]

            switch (choice) { // [cite: 11]
                case 0:
                    System.exit(0); // [cite: 11]
                case 1:
                    insert(queue); // [cite: 12]
                    break;
                case 2:
                    delete(queue);
                    break;
                case 3:
                    display(queue);
                    break;
                case 4:
                    if (is_full()) {
                        System.out.println("Queue is full.");
                    } else {
                        System.out.println("Queue is not full.");
                    }
                    break;
                case 5:
                    if (is_empty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice"); // [cite: 12]
            }
        }
    }
}