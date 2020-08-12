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
public class SpaceReplace {

    public static String replaceSpace(StringBuffer str){
        int P1 = str.length() - 1;
        for (int i = 0; i < P1; i++) {
            if (str.charAt(i) == ' ') {
                //补二个空格
                str.append("  ");
            }
        }
        int P2 = str.length() - 1;
        while (P1 >= 0 && P2 > P1) {
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            }else{
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();

    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("ABB CC");
        String newStr = SpaceReplace.replaceSpace(str);
        System.out.println(newStr);
    }
}
