package DsaAssignment06;
import java.util.Scanner;

public class ArrBasedStack {
    public static final int MAX = 10;

    public static int push(int[] S, int top) {
        Scanner sc = new Scanner(System.in);
        if (isFull(top)) {
            System.out.println("Stack Overflow");
        } else {
            System.out.print("Enter element to push: ");
            int x = sc.nextInt();
            S[++top] = x;
        }
        return top;
    }

    public static int pop(int[] S, int top) {
        if (isEmpty(top)) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped element: " + S[top--]);
        }
        return top;
    }

    public static void display(int[] S, int top) {
        if (isEmpty(top)) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(S[i]);
            }
        }
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[MAX];
        int top = -1;

        while (true) {
            System.out.println("\n***MENU***");
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
                    top = push(stack, top);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
