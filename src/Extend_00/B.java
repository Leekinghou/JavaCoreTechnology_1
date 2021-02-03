package Extend_00;

public class B extends A {
    public B(){
        System.out.println("333333");
    }
    public B(int a){
        super(a);
        System.out.println("4444444");
    }
    public static void main(String[] a){
        B obj1 = new B();
        System.out.println("xxxx");
        B obj2 = new B(10);

    }
}
