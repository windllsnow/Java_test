package jav_king;

public class Ch4_017 {
    public static void main(String[] args) {
        // 資料轉換與輸出
        int x1, x2;
        x1 = 17;
        x2 = -2;
        System.out.println("x1的2 進 位 是:" + Integer.toBinaryString(x1));
        System.out.println("x2的2 進位是" + Integer.toBinaryString(x2));
        System.out.println("x1的8 進 位 是:" + Integer.toOctalString(x1));
        System.out.println("x2的8 進位是" + Integer.toOctalString(x2));
        System.out.println("x1的16 進 位 是:" + Integer.toHexString(x1));
        System.out.println("x2的16 進位是" + Integer.toHexString(x2));

    }

}
