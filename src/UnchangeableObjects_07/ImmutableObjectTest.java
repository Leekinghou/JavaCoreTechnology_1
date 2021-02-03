package UnchangeableObjects_07;

public class ImmutableObjectTest {
    public static void change(String b){
        b = "def";
    }
    public static void main(String []args){
        String a = new String("abc");
        String b = a;
        System.out.println(b);
        a = "def";
        System.out.println(b);

        a = new String("abc");
        change(a);
        System.out.println(a);
        //由于不可变，临时变量指向新内存，外部实参的指针不改动
    }
}
