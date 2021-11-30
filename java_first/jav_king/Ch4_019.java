package jav_king;

import java.util.Scanner;

public class Ch4_019 {
    public static void main(String[] args) {
        // 讀取字元
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("請輸入字元：");
        ch = scanner.next().charAt(0);
        System.out.println("你輸入的字元是=" + ch);
        scanner.close();

    }

}
