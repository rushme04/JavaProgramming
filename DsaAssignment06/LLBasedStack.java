package DsaAssignment06;
import java.util.Scanner;

class Node {
    int info;
    Node next;
}

public class LLBasedStack {
    public static Node push(Node top) {
        Scanner sc = new Scanner(System.in);
        Node temp = new Node();
        System.out.print("Enter element to push: ");
        temp.info = sc.nextInt();
        temp.next = top;
        top = temp;
        return top;
    }

    public static Node pop(Node top) {
        if (top == null) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped element: " + top.info);
            top = top.next;
        }
        return top;
    }

    public static void display(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.info);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;

        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
