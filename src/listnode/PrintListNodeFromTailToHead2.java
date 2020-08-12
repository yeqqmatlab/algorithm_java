package listnode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 递归 实现
 * created by yqq 2020/8/12
 */
public class PrintListNodeFromTailToHead2 {

    public static List<Integer> print(ListNode listNode){

        List<Integer> list = new ArrayList<>();
        if (listNode == null) {
            return list;
        }
        addListRecur(listNode, list);
        return list;
    }

    /**
     * 递归 ：函数自己调自己    对应数据示例 f(n) = f(n-1)*n,f(1) = 1,n>0
     *  n = 4 f(4) = f(3)*4=f(2)*3*4=f(1)*2*3*4=1*2*3*4
     * @param listNode
     * @param list
     */
    private static void addListRecur(ListNode listNode, List<Integer> list) {
        if (listNode != null && listNode.next != null) {
            addListRecur(listNode.next,list);
        }
        list.add(listNode.data);
    }

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);

        List<Integer> list = PrintListNodeFromTailToHead2.print(listNode);

        list.forEach(System.out::println);
    }
}
