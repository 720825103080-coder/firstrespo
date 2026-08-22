import java.util.Scanner;

class Stack {
    int[] stack;
    int top;
    int size;

    // Create stack
    Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Insertion - PUSH
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " inserted into stack.");
        }
    }

    // Deletion - POP
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(stack[top] + " deleted from stack.");
            top--;
        }
    }

    // Traversal - DISPLAY
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack s = new Stack(size);

        while (true) {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Insert (Push)");
            System.out.println("2. Delete (Pop)");
            System.out.println("3. Traversal (Display)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
