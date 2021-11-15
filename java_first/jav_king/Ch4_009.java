package jav_king;

public class Ch4_009 {
    public static void main(String[] args) {
        //三元 運算子
        int x, y,larger,smaller;
        x=100;
        y=50;
        larger=x > y? x:y; //_____ ? : .....  ==> _____(運算式true 傳前者 ;false 傳後者)
        System.out.println("較大值: "+larger);
        smaller=x < y? x:y;
        System.out.println("較小值："+smaller);
    }
    
}
