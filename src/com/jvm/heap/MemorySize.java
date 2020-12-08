package com.jvm.heap;

/**
 *
 *
 *  -Xms1024m -Xmx1024m -XX:+PrintGCDetails
 *
 *  -XX:+PrintGCDetails：打印详细内存使用情况
 *  -Xms1024m：设置虚拟机初始化总内存
 *  -Xmx1024m：设置虚拟机最大可用内存
 */
public class MemorySize {
    public static void main(String[] args) {
        // 虚拟机最大可用内存，参数设置：-Xmx
        long maxUsedMemory = Runtime.getRuntime().maxMemory();
        // 返回虚拟机中的可用内存量
        long freeMemory = Runtime.getRuntime().freeMemory();
        // 返回虚拟机初始化总内存，参数设置：-Xms
        long totalInitMemory = Runtime.getRuntime().totalMemory();

        System.out.println("max memory: " + (double)maxUsedMemory / 1024 / 1024 + "Mb");//max memory: 247Mb
        System.out.println("free memory: " + (double)freeMemory / 1024 / 1024 + "Mb");
        System.out.println("total memory: " + (double)totalInitMemory / 1024 / 1024 + "Mb");//total memory: 15Mb


    }
}
