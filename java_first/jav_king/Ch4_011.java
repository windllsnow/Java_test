package jav_king;

public class Ch4_011 {
    public static void main(String args[]) {
        byte i,j;
        i=0B01111111;
        j=0b00000001;  
        System.out.println(i);
        System.out.println(~i+1);  //~運算子  就是 補數; 補數 +1 就是正負值相反
        System.out.println(j);
        System.out.println(~j+1);
    }
    
}
