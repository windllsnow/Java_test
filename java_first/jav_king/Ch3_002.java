package jav_king;

public class Ch3_002 {
    
    /** 
    *   '\ u XXXX'  用逸出字元序列 方式處理 Unicode碼  X是16進位
    */
    public static void main(String[] args) {
        char ch;
        ch= '\u0041';
        System.out.println(ch);
        ch='\u9B41';
        System.out.println(ch);
        ch='\u0022';
        System.out.println(ch);
    }

    
}
