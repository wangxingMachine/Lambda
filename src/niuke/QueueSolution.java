package niuke;

import java.util.Stack;

/**
 * Created by machine on 2017/7/5.
 */
public class QueueSolution {
    //两个栈模拟一个堆的功能
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() throws Exception {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new Exception("没有元素");
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) throws Exception {
        push(1);
        push(3);
        push(2);
        push(6);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }
}
