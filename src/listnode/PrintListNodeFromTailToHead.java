package listnode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * stack 实现
 * created by yqq 2020/8/12
 */
public class PrintListNodeFromTailToHead {

    public static List<Integer> print(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.data);
            listNode = listNode.next;
        }

        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        List<Integer> list = PrintListNodeFromTailToHead.print(listNode);

        list.forEach(System.out::println);
    }
}
