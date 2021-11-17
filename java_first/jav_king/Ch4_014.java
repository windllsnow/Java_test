package jav_king;

public class Ch4_014 {
    public static void main(String[] args){
        //自動資料轉換 轉成左邊
        int x ;
        double y;
        float z;
        long a;
        short x1=10;
        byte x2=5;
        y=(x=10)+3.3;
        System.out.println("y="+y);
        z=x+5.5F;
        System.out.println("z="+z);
        a=x+10L;
        System.out.println("a="+a);
        x=x1+x2;
        System.out.println("x="+x);

        //注意 變數 範圍
    }
    
}
