/**
 * Created by wangxing
 * Date: 2017/7/4.
 * Time: 23:29
 */
public class MeaningOfThis {
    public final int value = 4;
    public void doIT() {
        int value = 6;
        Runnable r = new Runnable() {
            private final int value = 5;
            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        MeaningOfThis meaningOfThis = new MeaningOfThis();
        meaningOfThis.doIT();//这一行输出什么
        //答案是5，因为this指的是包含它的runnable,而不是外面的类MeaningOfThis.
    }
}
