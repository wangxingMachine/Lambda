package niuke;

import java.util.ArrayList;

/**
 * Created by machine on 2017/7/5.
 */
public class Solution {


    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

    //二维数组查找是否包含某一个值
    public static boolean Find(int target, int[][] array) {
        int length = array.length - 1;
        int i = 0;
        while ((length >= 0) && i < array[0].length) {
            if (array[length][i] > target) {
                length--;
            } else if (array[length][i] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }


    /**
     * 替换输入的字符串中的空格为"%20"
     *
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        String result = "";
        String strString = str.toString();
        result = strString.replace("", "%20");
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = new int[0][0];
        System.out.println(Find(16, arr));
    }
}
