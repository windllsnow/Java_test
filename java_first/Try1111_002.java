public class Try1111_002 {

    public static void main(String[] args) {
      int [] intArr1=null;
      printData(intArr1);
      int [] intArr2={1,2,3,4,5};
      printData(intArr2);
    }
    private static void printData(int[] intArr){
        if(intArr==null){
            System.out.println("資料異常");
            return;// 以下程式不走，回原呼叫點
        }
        for (int i:intArr){
            System.out.println(i);
        }
    }
    
}
