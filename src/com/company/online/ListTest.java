package com.company.online;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by wangxing
 * Date: 2017/7/4.
 * Time: 23:37
 */
public class ListTest {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) { //引入类型参数T
        List<T> result = new ArrayList<T>();
        for (T t : list) {
            if(predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<Apple>();
        appleList.add(new Apple(1000, "red"));
        appleList.add(new Apple(50, "blue"));
        filter(appleList, (Apple apple) -> apple.getColor().equals("red"));

    }
}
