package com.collectionDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap由数组+链表组成的，数组是HashMap的主体，链表则是主要为了解决哈希冲突而存在的
 * 扩容机制： 当put操作时，判断当前元素是否达到阈值(默认16)，扩容时将重新计算容量并添加到新的容器中
 * 线程不安全，因为多线程put时会导致数据不一致
 * 元素无序
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();

        //  增加
        integerStringHashMap.put(1, "hello");
        integerStringHashMap.put(2, "world");
        integerStringHashMap.put(3, "!");

        //  删除
        integerStringHashMap.remove(3);

        // 替换
        integerStringHashMap.replace(2, "world!");//  底层调用put替换

        //  遍历
        //  使用Map.Entry键值对 对象遍历
        for (Map.Entry<Integer, String> entry :
                integerStringHashMap.entrySet()) {
            System.out.println("key = " + entry.getKey() + ", value = "+ entry.getValue());
        }

    }
}
