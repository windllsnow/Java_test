public class Dog extends Animal{
    void move(){
        super.move();//先走父親的
        System.out.println("Dog move");
    }
    
}
