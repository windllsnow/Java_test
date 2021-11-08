public class Try1108_cv_not {
    public static void main(String[] args){
        double average ;
        double total=0;
        double[] degree= {25,26,265,28,298,299,208};
        for (int i=0; i<degree.length; i++){
            total+= degree[i];
        average= total/degree.length;
        System.out.printf("一周平均溫度:%4.4f  \n",average);

                    
        } 


    }
    
}
