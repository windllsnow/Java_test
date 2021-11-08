import java.util.Arrays;
public class Try1108_005 {
    public static void main(String[] args){
        //陣列
        int[] intArray = {45,20,31};
        System.out.println(intArray[0]);
        System.out.println(intArray.length);
        
        Arrays.sort(intArray);
        System.out.printf("Is arr[]:%s",Arrays.toString(intArray));
    }
    
}
