package jav_king;

import java.util.Scanner;

public class Ch5_001 {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入年齡：");
        age = scanner.nextInt();
        if (age < 20) {
            System.out.println("年齡太小");
            System.out.println("需要20 歲哦！");
        }

    }

}