import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Apple> appleList = new ArrayList<Apple>();
        appleList.add(new Apple(1000, "red"));
        appleList.add(new Apple(50, "blue"));
        prettyPrintApple(appleList, new ApplePredicateImpl());

    }

    /**
     *
     * @param inventory
     * @param applePredicate
     */
    private static void prettyPrintApple(List<Apple> inventory, ApplePredicate applePredicate) {
        for (Apple apple : inventory) {
            System.out.println(applePredicate.test(apple));
        }
    }
}
