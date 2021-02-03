package ExceptionDemo_14;

public class MultipleCatchDemo {
    public static void main(String []args){
        try{
            int a = 5/0;
            System.out.println("a is " + a);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("Parse 1 is over");
        }
    }
}
