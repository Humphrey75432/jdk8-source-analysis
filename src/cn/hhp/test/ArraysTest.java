package cn.hhp.test;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        // copyOfRange方法，使用native方法实现，效率很高
        char[] chars = {
                'h','e','l','l','o',
                'w','o','r','l','d'
        };
        char[] result1 = Arrays.copyOfRange(chars, 0, chars.length >> 1);
        char[] result2 = Arrays.copyOfRange(chars, 5, chars.length);
        System.out.println("result1 add is " + result1 + ", value is " + new String(result1));
        System.out.println("result2 add is " + result2 + ", value is " + new String(result2));
    }
}
