package spaceReplace;

/**
 * 将一个字符串中的空格替换成 "%20"。
 *  Input:
 * "A B"
 *
 * Output:
 * "A%20B"
 *
 * created by yqq 2020/8/12
 */
public class SpaceReplace2 {

    public static String replaceSpace(StringBuffer str){
        String newStr = str.toString().replaceAll("[ ]", "%20");
        return newStr;
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("ABB CC  DD");
        String newStr = SpaceReplace2.replaceSpace(str);
        System.out.println(newStr);
    }
}
