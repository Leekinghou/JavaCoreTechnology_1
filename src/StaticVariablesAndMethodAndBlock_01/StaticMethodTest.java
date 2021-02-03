package StaticVariablesAndMethodAndBlock_01;

public class StaticMethodTest {
    int a = 1111111;
    static int b = 2222222;
    public static void hello(){
        System.out.println("0000000");
        System.out.println(b);
        //System.out.println(a); //错误，不能调用非静态变量
        //hi(); //错误，不能调用非静态方法

    }

    public void hi(){
        System.out.println("333333333");
        hello();
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String []a){
        //StaticMethod可以用类名直接引用，无需new对象来引用
        StaticMethodTest.hello();
        //StaticVariablesAndMethodAndBlock.StaticMethodTest.hi();  error 不能使用类名来引用非静态方法
        StaticMethodTest foo = new StaticMethodTest();
        foo.hello(); //warning,but it is ok
        foo.hi();
    }
}
