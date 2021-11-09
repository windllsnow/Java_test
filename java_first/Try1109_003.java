public class Try1109_003 {
    public static void main(String[] args){
        //java 7 版本 以前  不能用 字串去 判斷哦！
        //下面類型 要一致哦！
        int intScore=2;

        switch(intScore){
            case 5:
                System.out.println("555");
                break;//滿足跳出去，不滿足繼續跑
            case 4:
                System.out.println("444");
                break;//滿足跳出去，不滿足繼續跑
            default:
                System.out.println("資料異常");

    }
        String strScore="x";

        switch(strScore){
            case "xxxx":
                System.out.println("x");
                break;
            case "xx":
                System.out.println("xx");
                break;
            case "xxx":
                System.out.println("xxx");
                break;
            default:
                System.out.println("error see it please!");

        }



    }
    
}
