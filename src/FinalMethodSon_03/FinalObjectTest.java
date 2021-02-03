package FinalMethodSon_03;

class FinalObject
{
    int a = 10;
}
public class FinalObjectTest {
    public static void main(String []args){
        final FinalObject obj1 = new FinalObject();
        System.out.println(obj1.a);
        obj1.a = 20;
        System.out.println(obj1.a);
        //obj1 = new FinalObject();
        //final1对象不能改变指针
    }
}
