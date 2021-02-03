package ExceptionDemo_14;

public class TryDemo {
    public static void main(String []args){
        try{
            int a = 5/2;
            System.out.println("a is " + a);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("Parse 1 is over");
        }
        try{
            int a = 5/0;  //ArithmeticException
            System.out.println("a is " + a);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("Parse 2 is over");
        }
        try{
            int a = 5/0;
            System.out.println("a is " + a);
        }catch (Exception ex){
            ex.printStackTrace();
            int a = 5/0;
        }finally {
            System.out.println("Parse 3 is over");
        }
    }
}
