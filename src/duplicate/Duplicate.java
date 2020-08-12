package duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组中重复的数字
 *
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * created by yqq 2020/8/6
 */
public class Duplicate {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 0, 2, 5};

        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(i)) {
                System.out.println("--->"+i);
                break;
            }else {
                set.add(i);
            }
        }
    }
}
