package com.jvm.heap;

import java.util.ArrayList;

/**
 * -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 */
public class DumpFileTest {
    byte[] array = new byte[1024];

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        int cnt = 0;

        try {
            while (true) {
                DumpFileTest dumpFileTest = new DumpFileTest();
                objects.add(dumpFileTest);
                cnt++;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(cnt);
        }

    }
}
