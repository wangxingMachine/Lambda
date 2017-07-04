/**
 * Created by wangxing
 * Date: 2017/7/4.
 * Time: 23:05
 */
public class ApplePredicateImpl implements ApplePredicate {

    @Override
    public String test(Apple apple) {
        return "apple weight is" + apple.getWeight() + ","
                + (apple.getWeight() > 100 ? "重的" : "轻的");
    }
}
