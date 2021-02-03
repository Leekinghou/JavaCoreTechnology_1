package ExceptionDemo_14;

import java.io.IOException;

public class Father {
    public void f1() throws ArithmeticException{}

}
//public class Son extends Father{
////    public void f1() throws IOException{ //error
////        //子类重写方法，所抛出的异常不能超过父类规定的范围
////    }
//}