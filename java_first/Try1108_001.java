public class Try1108_001 {
    public static void main(String[] args) {
        int a=17;
        int b=7;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("____");

        System.out.println(a+=b);//a=24
        System.out.println(a-=b);//a=17
        System.out.println(a/=b);//a=2
        System.out.println(a);
        int z=17;
        System.out.println(z%=b);
        System.out.println(z);

    }
}
