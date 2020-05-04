package cn.hhp.test.lang;

public class TestString {
    public static void main(String[] args) {
        // String hashCode的计算方法
        char[] chars = {'c','b','a','d'};
        System.out.println("使用calculateHashCode计算出的结果: " + TestString.calculateHashCode(chars));
        System.out.println("使用String的hashCode计算出的结果：" + new String(chars).hashCode());

        // 获取字符的ASCII码 -- 10进制
        String sample = new String(chars);
        System.out.println("codePoint from String, s = " + sample.codePointAt(1));
        System.out.println("codePoint before String, s = " + sample.codePointBefore(1));
        System.out.println("codePointCount: " + sample.codePointCount(0, 2));
    }

    private static int calculateHashCode(char[] chars) {
        int hashCode = 0;
        for (char c : chars) {
            hashCode = 31 * hashCode + c;
        }
        return hashCode;
    }
}
