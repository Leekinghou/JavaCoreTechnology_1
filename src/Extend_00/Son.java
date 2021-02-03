package Extend_00;

public class Son extends Father{
    public static void main(String []args){
        Son s = new Son();
        s.f1();
        //Son中没有定义f1，而是通过父类继承的
    }
}


