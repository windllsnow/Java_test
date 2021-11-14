package jav_king;
import java.util.Scanner;
public class Ytest_001 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);// 叫__ 出來; =重 命 名

        System.out.println("what is your name?");
        String name = scanner.nextLine();//  input值 給  變數
        System.out.println("how old are you?");
        int age= scanner.nextInt();//  input值 給  變數


        System.out.println("Hello"+"\t"+name);
        System.out.println("You are " + age+" years old");
        scanner.close();
    }
    
}
