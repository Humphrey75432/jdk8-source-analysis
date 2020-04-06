package cn.hhp.test;

import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) {
        // 获取JVM属性
        Properties jvmProperties = System.getProperties();

        // 获取指定JVM属性的值
        String jdk_version = System.getProperty("java.version");
        String jdk_vendor = System.getProperty("java.vendor");

        // native方法
        // System.arraycopy(char[] origin, int originalPos, char[] dest, int destPos, int copyLength)
        // System.arraycopy是浅复制，两份实例指向同一个内存地址
        char[] origin = {'h','e','l','l','o','k'};
        char[] dest = new char[origin.length];
        System.arraycopy(origin, 0, dest, 0, origin.length);
        System.out.println(dest);
    }
}
