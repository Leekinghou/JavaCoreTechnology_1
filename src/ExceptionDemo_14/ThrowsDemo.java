package ExceptionDemo_14;

public class ThrowsDemo {
    public static void main(String []args){
        try{
            int result = new Test1().divide(3,1);
            System.out.println("a is " + result);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        int result = new Test1().divide(3,0);
        System.out.println("the 2nd result is " + result);
    }
}
class Test1 {
    public int divide(int x,int y) throws ArithmeticException
    {
        //ArithmeticException is a RuntimeException,not checked exception
        int result = x / y;
        return x / y;
    }

}
