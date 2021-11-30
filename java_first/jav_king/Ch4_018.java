package jav_king;

import java.util.Scanner;

public class Ch4_018 {
    public static void main(String[] args) {

        int x1, x2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入2 個整數(數字用空白隔開)：");
        x1 = scanner.nextInt(); // 取 整數
        x2 = scanner.nextInt();
        System.out.println("你輸入的第一個數字：" + x1);
        System.out.println("你輸入的第二個的數字：" + x2);
        System.out.println("數字總和：" + (x1 + x2));

        String y, y1;
        System.out.println("請輸入姓名：");
        y = scanner.next(); // 取字串
        y1 = scanner.nextLine(); // 讀 整行字串 ; 前 面 賦予y 了 所有 後面給y1
        System.out.printf("嗨！  %s 歡 迎使用本系統", y);
        System.out.printf("嗨！  %s 歡 迎使用本系統", y1);
        scanner.close();
    }

}
