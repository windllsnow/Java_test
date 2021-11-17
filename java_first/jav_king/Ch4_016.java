package jav_king;

public class Ch4_016 {
    public static void main(String[] args) {
        // (int)
        //(float)
        // (double)
        int x=7;
        int y=2;
        double z;
        z=x/y; //取商 double 格式
        System.out.println("z="+z);
        z=(double)x/y;//除法結果 double 格式
        System.out.println("z="+z);
        System.out.println("z="+(int)z);
    }
}
