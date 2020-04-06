package cn.hhp.test;

public class JavaLangTest {
    public static void main(String[] args) {
        // String hashCode的计算方法
        char[] chars = {'h','e','l','l','o'};
        String str = new String(chars);
        int hash = 0;
        for (char c : chars) {
            hash = 31 * hash + c;
        }
        System.out.println((hash == str.hashCode()) ? "hashCode is " + hash : 0);
    }
}
