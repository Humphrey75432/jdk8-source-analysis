package cn.hhp.test.lang;

public class TestBoolean {
    public static void main(String[] args) {
        // 逻辑与
        System.out.println("[logicalAnd] " + Boolean.logicalAnd(true, false));
        System.out.println("true && false");
        System.out.println(true && false);
        System.out.println();

        // 逻辑或
        System.out.println("[logicalOr] " + Boolean.logicalOr(true, false));
        System.out.println("true || false");
        System.out.println(true || false);
        System.out.println();

        // 逻辑异或
        System.out.println("[logicalXor] " + Boolean.logicalXor(true, false));
        System.out.println("true ^ false");
        System.out.println(true ^ false);
    }
}
