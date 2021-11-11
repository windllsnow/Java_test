public class Try1111_001 {
    public static void main(String[] args){
        int [] intArr={0,1,2,3,4,5,6,7};

        for(int i:intArr){
            if(i==6){   //6 跳出去 ;0,1,2,3,4,5
                break;
            }
            if(i<=4){//>4 跳出去
                continue;
            }

            System.out.println(i);
        }


    }
    
}
