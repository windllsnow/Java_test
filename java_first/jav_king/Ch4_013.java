package jav_king;

public class Ch4_013 {
    public static void main(String[] args){
        //資料型態轉換
        int x;
        byte i =10;
        char ch='A';
        float y;
        //宣告什麼，a賦予它 ，就是轉換成它
        x=i;
        System.out.println("x="+x);  //byte->nt
        x=ch;
        System.out.println("x="+x); //char-> int
        y=10;
        System.out.println("y="+y);//10->float
    }    
}
