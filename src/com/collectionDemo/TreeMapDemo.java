package com.collectionDemo;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 元素默认按照keys的自然排序排列
 * 原始比较强key不可以为null
 * TreeMap为有序的KV集合，key必须实现Comparable接口（排序、去重）
 * TreeMap非同步线程不安全，内部实现红黑树
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> integerStringTreeMap2 = new TreeMap<>();  // 默认构造，自然排序
        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>(Comparator.reverseOrder());  //  比较器构造

        //  添加
        integerStringTreeMap.put(2, "world");
        integerStringTreeMap.put(1, "hello");
        integerStringTreeMap.put(3, "!");
        System.out.println("integerStringTreeMap = " + integerStringTreeMap);  //integerStringTreeMap = {3=!, 2=world, 1=hello}

        //  修改
        integerStringTreeMap.put(1, "Hello");
        integerStringTreeMap.replaceAll((s1, s2)->{// lambda，接受<K, V> 返回新V替换旧V
            if (s1 > 1){
                s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
            }

            return s2;
        });
        System.out.println("integerStringTreeMap = " + integerStringTreeMap); // integerStringTreeMap = {3=!, 2=World, 1=Hello}
        
        //  遍历
        Set<Map.Entry<Integer, String>> entries = integerStringTreeMap.entrySet();
        for (Map.Entry entry:
                entries) {
            System.out.println("entry = " + entry.toString());
        }

        //integerStringTreeMap.put(null, "13");//NullPointerException:原始比较器key不可以为null

        //  删除
        integerStringTreeMap.remove(1);
        integerStringTreeMap.clear();  //删除全部
    }
}
