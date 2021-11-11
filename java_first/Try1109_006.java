import java.util.Scanner; 
public class Try1109_006{
    public static void main(String[] args){
        int intVal=0;
        while(intVal <=10){
            System.out.println("intVal:"+intVal);
            intVal++;
        }

        Scanner scanner=new Scanner(System.in);

        String input;
        do{
            System.out.println("是否離開?");
            input=scanner.next();
        }while(!input.equals("y"));
          

        System.out.println("已離開");
        scanner.close();

        

    }
}