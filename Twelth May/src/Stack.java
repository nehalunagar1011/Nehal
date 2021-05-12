package src;
import java.util.*;

public class Stack {
	
	static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    Stack() {}
    
    Stack(int n)
    {
        top = -1;
        int size = n;
        char[] b = new char[size];
    }
    
    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x);
            return true;
        }
    }
    
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
    
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
