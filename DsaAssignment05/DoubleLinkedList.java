package DsaAssignment05;

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    }
}

public class DoubleLinkedList {
    static Scanner sc = new Scanner(System.in);

    public static Node create(Node start, Node end) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = end = newNode;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return end;
    }

    public static void display(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = start;
        while (temp != null) {
            System.out.println("Regd No: " + temp.regd_no + ", Mark: " + temp.mark);
            temp = temp.next;
        }
    }

    public static Node insBeg(Node start, Node end) {
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);
        if (start == null) {
            start = end = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return start;
    }

    public static Node insEnd(Node start, Node end) {
        return create(start, end);
    }

    public static Node insAny(Node start, Node end) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        System.out.print("Enter registration number: ");
        int regd_no = sc.nextInt();
        System.out.print("Enter mark: ");
        float mark = sc.nextFloat();
        Node newNode = new Node(regd_no, mark);

        if (pos == 1) {
            return insBeg(start, end);
        }

        Node temp = start;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid position");
            return start;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null) {
            System.out.println("List is empty.");
            return start;
        }
        start = start.next;
        if (start != null) start.prev = null;
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if (end == null) {
            System.out.println("List is empty.");
            return end;
        }
        if (end.prev != null) {
            end = end.prev;
            end.next = null;
        } else {
            start = end = null;
        }
        return end;
    }

    public static Node delAny(Node start, Node end) {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            return delBeg(start, end);
        }

        Node temp = start;
        for (int i = 1; temp != null && i < pos; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return start;
        }

        if (temp.next != null)
            temp.next.prev = temp.prev;
        if (temp.prev != null)
            temp.prev.next = temp.next;

        return start;
    }

    public static void search(Node start) {
        System.out.print("Enter registration number to search: ");
        int regd_no = sc.nextInt();
        Node temp = start;
        while (temp != null) {
            if (temp.regd_no == regd_no) {
                System.out.println("Student found. Current mark: " + temp.mark);
                System.out.print("Enter new mark: ");
                temp.mark = sc.nextFloat();
                System.out.println("Mark updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with regd_no " + regd_no + " not found.");
    }

    public static void main(String[] args) {
        Node start = null, end = null;
        while (true) {
            System.out.println("\n****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Search and Update Mark");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    end = create(start, end);
                    if (start == null) start = end;
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = insBeg(start, end);
                    break;
                case 4:
                    end = insEnd(start, end);
                    break;
                case 5:
                    start = insAny(start, end);
                    break;
                case 6:
                    start = delBeg(start, end);
                    break;
                case 7:
                    end = delEnd(start, end);
                    break;
                case 8:
                    start = delAny(start, end);
                    break;
                case 9:
                    search(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}