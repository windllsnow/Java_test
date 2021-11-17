package jav_king;

public class Ch4_012 {
    public static void main(String[] args){
        //java 運算子優先順序
        
        //難 
        int x;
        x=9*4<<3+2;
        System.out.println("x="+x);
        x=(9*4)<<(3+2); //建議
        System.out.println("x="+x);
        
        //
        int y,i,j;
        i=j=5;
        y=++i + j++  *3 ;//6+5*3=21 ; j=j+1=6
        System.out.println("y="+y);
        y=i++ + ++j *3;//6+7*3=27; i=i+1 =7
        System.out.println("y="+y);
        //
        // () ==> - !  ~ ++ -- ==>*/ %==> + - ==>  <<  >> >> ==> == != ==> 邏輯->簡化邏輯->三元->指定->+= ^=  <<=  >>>=........
        int z;
        z=5*4+8%3 <<3;
        System.out.println("z="+z);
        z=((5*4)+(8%3))<<3;
        System.out.println("z="+z);



    }
    
}
