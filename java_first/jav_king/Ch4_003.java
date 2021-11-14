package jav_king;

public class Ch4_003 {
    public static void main(String[] args){
        int i , j ;
        i=j=10;
        System.out.println("i="+i);
        i++;// i ===>i=i+1
        System.out.println("i="+i);
        i--;//i===>i=i-1
        System.out.println("i="+i);
        j=--i *10;//==>j=j-1 ==> j*10
        System.out.println("j="+j);
        j=++j *10;//==>j=j+1 ==> j*10
        System.out.println("j="+j);
    }
    
}
