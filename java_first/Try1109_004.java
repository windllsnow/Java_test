public class Try1109_004 {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        String strVal ="999";



        if("1".equals(strVal)){
            System.out.println(strVal);
        }
        else if("2".equals(strVal)){
            System.out.println(strVal);
        }
        else if("3".equals(strVal)){
            System.out.println(strVal);
        }

        else if("4".equals(strVal)){
            System.out.println(strVal);
        }
        else if("5".equals(strVal)){
            System.out.println(strVal);
        }

        else if("6".equals(strVal)){
            System.out.println(strVal);
        }

        else if("7".equals(strVal)){
            System.out.println(strVal);
        }
        else if("8".equals(strVal)){
            System.out.println(strVal);
        }
        else if("9".equals(strVal)){
            System.out.println(strVal);
        }
        else if("10".equals(strVal)){
            System.out.println(strVal);
        }
        else if("11".equals(strVal)){
            System.out.println(strVal);
        }
        else if("12".equals(strVal)){
            System.out.println(strVal);
        }
        else if("13".equals(strVal)){
            System.out.println(strVal);
        }
        else{
            System.out.println(strVal);
        }
        
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);

        System.out.println("__");
        long startTime1 = System.nanoTime();
        switch(strVal){
            case "1":
                System.out.println(strVal);
                break;
            case "2":
                System.out.println(strVal);
                break;
            case "3":
                System.out.println(strVal);
                break;
            case "4":
                System.out.println(strVal);
               break;
            case "5":
               System.out.println(strVal);
               break;
            case "6":
                System.out.println(strVal);
                break;
            case "7":
                System.out.println(strVal);
                break;
            case "8":
                System.out.println(strVal);
                break;
            case "9":
                System.out.println(strVal);
                break;
            case "10":
                System.out.println(strVal);
                break;
            default:// 以上都不符合 執行
                System.out.println(strVal);
        long endTime1 = System.nanoTime();
        System.out.println(endTime1-startTime1);
        }                                       



    } 
}
