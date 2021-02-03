package Extend_00;

//public class Man {
//    int height;
//    int weight;
//    public void eat(){};
////    public void plought(){}; //耕田
//}

public  class Man extends Human{
    public void plought(){}; //耕田
    public void eat(){
        System.out.println("I can eat more");
    }
    public static void main(String [] args){
        Man obj1 = new Man();
        obj1.eat();

        Human obj2 = (Human) obj1;
        obj2.eat();

        Man obj3 = (Man) obj2;
        obj3.eat();
    }

}
