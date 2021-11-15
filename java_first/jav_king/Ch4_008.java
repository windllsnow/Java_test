package jav_king;

public class Ch4_008 {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        int i =5;
        System.out.println("a&&b= "+(a&&b));
        System.out.println("a||b= "+(a||b));
        System.out.println("a^b= "+(a^b));
        System.out.println("a&& (i++==5)= "+(a&&(i++==5))); //a = true   所以 && ||  是半殘(纙輯運算短路)
        System.out.println("a& (i++==5)= "+(a&(i++==5)));//a = true __false(i=6 (不等於5))==>false 

    }
    
}
